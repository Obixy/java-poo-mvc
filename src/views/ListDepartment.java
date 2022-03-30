package views;

import java.util.List;

import controllers.DepartmentController;
import models.Department;

public class ListDepartment {

	public static void execute(List<Department> departments) {
		System.out.println("|====================================|");
		System.out.println("|         TODOS DEPARTAMENTOS        |");
		System.out.println("|====================================|");

		DepartmentController.get(departments);
	}

}
