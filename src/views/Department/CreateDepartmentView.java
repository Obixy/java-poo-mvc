package views.Department;

import java.util.Scanner;

import controllers.DepartmentController;
import models.Department;

public class CreateDepartmentView {

	public static DepartmentController controller;
	public static Scanner scan;
	
	public CreateDepartmentView(DepartmentController controller, Scanner scan) {
		this.controller = controller;
		this.scan = scan;
	}
	
	public static void execute() {
		System.out.println("|====================================|");
		System.out.println("|       CADASTRAR DEPARTAMENTO       |");
		System.out.println("|====================================|");

		System.out.print("| Digite o nome do departamento: ");
		var name = scan.next();

		var createdDepartment = new Department(name);

		System.out.println("|====================================|");
		System.out.println("|             CADASTRADO             |");
		System.out.println("|====================================|");
		
		controller.post(createdDepartment);
	}

}
