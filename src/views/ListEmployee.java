package views;

import java.util.List;

import controllers.EmployeeController;
import models.Employee;

public class ListEmployee {

	public static void execute(List<Employee> employees) {
		System.out.println("|====================================|");
		System.out.println("|         TODOS DEPARTAMENTOS        |");
		System.out.println("|====================================|");

		EmployeeController.get(employees);
	}

}
