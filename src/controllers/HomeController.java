package controllers;

import java.util.Scanner;

import Repositories.DepartmentRepository;
import Repositories.EmployeeRepository;
import Services.DepartmentService;
import views.Department.CreateDepartmentView;
import views.Department.ListDepartmentView;
import views.Employee.CreateEmployeeView;
import views.Employee.ListEmployeeView;
import views.Home.HomeView;

public class HomeController {

	private DepartmentService deparmentService;

	public HomeController(DepartmentService departmentService) {
		this.deparmentService = departmentService;
	}

	public static void start() {
		HomeView.Home();
	}

	public void RedirectTo(int option) {
		switch (option) {
		case 1:
			CreateEmployeeView.execute(deparmentService.GetAll());
			break;
		case 2:
			ListEmployeeView.execute();
			break;
		case 3:
			CreateDepartmentView.execute();
			break;
		case 4:
			ListDepartmentView.execute();
			break;
		default:
			break;
		}
	}

}
