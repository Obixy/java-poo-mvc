package Services;

import java.util.List;

import Repositories.EmployeeRepository;
import abstractions.services.IEmployeeService;
import models.Employee;

public class EmployeeService implements IEmployeeService {
	
	private EmployeeRepository repo;

	public EmployeeService(EmployeeRepository repo) {
		this.repo = repo;
	}
	
	public List<Employee> GetAll(){
		return this.repo.GetAll();
	}
	public void Add(Employee employee) {
		this.repo.Add(employee);
	}
}
