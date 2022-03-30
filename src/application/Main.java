package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Department;
import models.Employee;
import views.CreateDepartment;
import views.CreateEmployee;
import views.ListDepartment;
import views.ListEmployee;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String Args[]) {

		List<Department> departments = new ArrayList<Department>();
		List<Employee> employees = new ArrayList<Employee>();
		Integer option;

		do {

			System.out.println("|===================================|");
			System.out.println("|          SEJA BEM VINDO!          |");
			System.out.println("|===================================|");
			System.out.println("| [1] Cadastrar funcionário         |");
			System.out.println("| [2] Listar funcionário            |");
			System.out.println("| [3] Cadastrar departamento        |");
			System.out.println("| [4] Listar departamento           |");
			System.out.println("| [0] Fechar aplicação              |");
			System.out.println("|===================================|");
			option = scan.nextInt();

			switch (option) {
			case 1:
				CreateEmployee.execute(employees, departments);
				break;
			case 2:
				ListEmployee.execute(employees);
				break;
			case 3:
				CreateDepartment.execute(departments);
				break;
			case 4:
				ListDepartment.execute(departments);
				break;
			default:
				break;
			}
			
		} while (!option.equals(0));

	}

}
