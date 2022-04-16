package controllers;

import java.util.List;

import Repositories.EmployeeRepository;
import Services.EmployeeService;
import models.Employee;

public class EmployeeController {

	EmployeeService service;
	
	public EmployeeController(EmployeeService service){
		this.service = service;
	}
	
	// POST === Criar
	public void post(Employee newEmployee) {
		this.service.Add(newEmployee);
		HomeController.start();
	}

	// GET === Listar
	public List<Employee> getAll() {
		return this.service.GetAll();
	}
}