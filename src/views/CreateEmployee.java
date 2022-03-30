package views;

import java.util.List;
import java.util.Scanner;

import controllers.EmployeeController;
import models.Department;
import models.Employee;

public class CreateEmployee {

	public static Scanner scan = new Scanner(System.in);

	public static void execute(List<Employee> employees, List<Department> departments) {
		System.out.println("|====================================|");
		System.out.println("|       CADASTRAR FUNCIONÁRIO        |");
		System.out.println("|====================================|");

		System.out.print("| [1] Digite o nome: ");
		var name = scan.nextLine();

		System.out.print("| [2] Digite a idade: ");
		var age = scan.nextInt();

		System.out.print("| [3] Digite o peso: ");
		var weight = scan.nextDouble();

		System.out.print("| [4] Digite o salario: ");
		var salary = scan.nextDouble();

		System.out.println("| [5] Selecione o departamento: ");
		
		ListDepartment.execute(departments);
		System.out.print("| Digite a posição selecionada: ");
		Department department = verifyDepartment(departments);

		var createdEmployee = new Employee(employees.size() + 1, name, age, weight, salary, department);

		EmployeeController.post(employees, createdEmployee);
		
		System.out.println("|====================================|");
		System.out.println("|             CADASTRADO             |");
		System.out.println("|====================================|");
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
