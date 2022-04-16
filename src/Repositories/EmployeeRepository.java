package Repositories;

import java.util.ArrayList;
import java.util.List;

import models.Employee;

public class EmployeeRepository {
	List<Employee> employees = new ArrayList<Employee>();
	
	public List<Employee> GetAll(){
		return this.employees;
	}
	
	public Employee Get(Integer id) {
		return this.employees.get(id);
	}
	
	public void Add(Employee employee) {
		employee.setId(employees.size());
		this.employees.add(employee);
	}
}
