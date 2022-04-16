package views.Employee;

import controllers.EmployeeController;
import controllers.HomeController;

public class ListEmployeeView {
	
	private static EmployeeController controller;

	public ListEmployeeView(EmployeeController controller) {
		this.controller = controller;
	}
	
	public static void execute() {
		System.out.println("|====================================|");
		System.out.println("|         TODOS EMPLOYEES            |");
		System.out.println("|====================================|");

		controller.getAll().forEach(e -> System.out.println(e.toString()));
		
		HomeController.start();
	}

}
