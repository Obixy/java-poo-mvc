package views.Employee;

import java.util.List;
import java.util.Scanner;

import controllers.EmployeeController;
import models.Department;
import models.Employee;

public class CreateEmployeeView {
	
	private static Scanner scan;
	private static EmployeeController controller;
	
	public CreateEmployeeView(Scanner scan, EmployeeController controller) {
		this.scan = scan;
		this.controller = controller;
	}
	
	public static void execute(List<Department> departments) {
		System.out.println("|====================================|");
		System.out.println("|       CADASTRAR FUNCIONÃ�RIO       |");
		System.out.println("|====================================|");

		System.out.print("| [1] Digite o nome: ");
		var name = scan.next();

		System.out.print("| [2] Digite a idade: ");
		var age = scan.nextInt();

		System.out.print("| [3] Digite o peso: ");
		var weight = scan.nextDouble();

		System.out.print("| [4] Digite o salario: ");
		var salary = scan.nextDouble();

		System.out.println("| [5] Selecione o departamento: ");
		
		departments.forEach(d -> System.out.println(d.toString()));
		System.out.print("| Digite a posiÃ§Ã£o selecionada: ");
		var department = verifyDepartment(departments);

		var employee = new Employee(name, age, weight, salary, department);
		
		System.out.println("|====================================|");
		System.out.println("|             CADASTRADO             |");
		System.out.println("|====================================|");

		controller.post(employee);
	}

	public static Department verifyDepartment(List<Department> departments) {

		var id = scan.nextInt();

		for (Department department : departments) {
			if (department.getId().equals(id)) {
				return department;
			}
		}

		return null;
	}
}
