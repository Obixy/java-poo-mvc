package controllers;

import java.util.List;

import models.Department;

public class DepartmentController {

	// POST === Criar
	public static void post(List<Department> departments, Department newDepartment) {
		departments.add(newDepartment);
	}

	// GET === Listar
	public static void get(List<Department> departments) {
		departments.forEach(res -> {
			System.out.println(res.toString());
		});
	}

}
