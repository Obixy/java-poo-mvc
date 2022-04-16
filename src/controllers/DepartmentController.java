package controllers;

import java.util.List;

import Services.DepartmentService;
import models.Department;

public class DepartmentController {

	private DepartmentService service;

	public DepartmentController(DepartmentService service) {
		this.service = service;
	}
	
//	 POST === Criar
	public void post(Department newDepartment) {
		this.service.Add(newDepartment);;
		HomeController.start();
	}

//	 GET === Listar
	public List<Department> get() {
		return this.service.GetAll();
	}
}