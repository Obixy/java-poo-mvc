package controllers;

import java.util.List;

import models.Employee;

public class EmployeeController {

	// POST === Criar
	public static void post(List<Employee> employees, Employee newEmployee) {
		employees.add(newEmployee);
	}

	// GET === Listar
	public static void get(List<Employee> employees) {
		employees.forEach(res -> {
			System.out.println(res.toString());
		});
	}

}
