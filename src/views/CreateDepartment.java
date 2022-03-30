package views;

import java.util.List;
import java.util.Scanner;

import controllers.DepartmentController;
import models.Department;

public class CreateDepartment {

	public static Scanner scan = new Scanner(System.in);

	public static void execute(List<Department> departments) {
		System.out.println("|====================================|");
		System.out.println("|       CADASTRAR DEPARTAMENTO       |");
		System.out.println("|====================================|");

		System.out.print("| Digite o nome do departamento: ");
		var name = scan.next();

		var createdDepartment = new Department(departments.size() + 1, name);

		DepartmentController.post(departments, createdDepartment);

		System.out.println("|====================================|");
		System.out.println("|             CADASTRADO             |");
		System.out.println("|====================================|");
	}

}
