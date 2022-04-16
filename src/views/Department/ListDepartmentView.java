package views.Department;

import controllers.DepartmentController;
import controllers.HomeController;

public class ListDepartmentView {

	public static DepartmentController controller;
	
	public ListDepartmentView(DepartmentController controller) {
		this.controller = controller;
	}
	
	public static void execute() {
		System.out.println("|====================================|");
		System.out.println("|         TODOS DEPARTAMENTOS        |");
		System.out.println("|====================================|");

		controller.get().forEach(d -> System.out.println(d.toString()));
		
		HomeController.start();
	}

}
