package application;

import java.util.Scanner;

import Repositories.DepartmentRepository;
import Repositories.EmployeeRepository;
import Services.DepartmentService;
import Services.EmployeeService;
import controllers.DepartmentController;
import controllers.EmployeeController;
import controllers.HomeController;
import views.Department.CreateDepartmentView;
import views.Department.ListDepartmentView;
import views.Employee.CreateEmployeeView;
import views.Employee.ListEmployeeView;
import views.Home.HomeView;

public class DependencyInjection {
	
	public static void ViewsInjections() {
		Scanner scan = new Scanner(System.in);
		var departmentService = new DepartmentService(new DepartmentRepository());
		var employeeService = new EmployeeService(new EmployeeRepository());
		
		var homeController = new HomeController(departmentService);
		var employeeController =  new EmployeeController(employeeService);
		var departmenController = new DepartmentController(departmentService);
		
		var homeView = new HomeView(scan, homeController);
		
		var createEmployeeView = new CreateEmployeeView(scan, employeeController);
		var listEmployeeView = new ListEmployeeView(employeeController);
		
		var createDepartment = new CreateDepartmentView(departmenController, scan);
		var listDepartment = new ListDepartmentView(departmenController);
		
		HomeController.start();
	}

}
