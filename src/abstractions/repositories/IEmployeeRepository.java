package abstractions.repositories;

import java.util.List;

import models.Employee;

public interface IEmployeeRepository {
	List<Employee> GetAll();
	void Add(Employee employee);
}
