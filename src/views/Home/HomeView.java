package views.Home;

import java.util.Scanner;

import controllers.HomeController;

public class HomeView {
	private static Scanner scan;
	private static HomeController controller;

	public HomeView(Scanner scan, HomeController controller) {
		this.scan = scan;
		this.controller = controller;
	}
	
	public static void Home() {
		System.out.println("|===================================|");
		System.out.println("|          SEJA BEM VINDO!          |");
		System.out.println("|===================================|");
		System.out.println("| [1] Cadastrar funcionario         |");
		System.out.println("| [2] Listar funcionario            |");
		System.out.println("| [3] Cadastrar departamento        |");
		System.out.println("| [4] Listar departamento           |");
		System.out.println("| [0] Fechar aplicação              |");
		System.out.println("|===================================|");
		var option = scan.nextInt();
		
		controller.RedirectTo(option);
	}
}