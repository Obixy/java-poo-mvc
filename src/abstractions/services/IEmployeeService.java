package abstractions.services;

import java.util.List;
import models.Employee;

public interface IEmployeeService {
	List<Employee> GetAll();
	void Add(Employee employee);
}
