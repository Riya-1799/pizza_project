package pizza_project;

import java.util.Scanner;

public class toppings_display extends pizza_menu {
	pizza_menu p = new pizza_menu();
	Scanner sc = new Scanner(System.in);
	void display() {
		System.out.println("------we have different 4 toppings:------");
		System.out.println("1.onion --> 3$");
		System.out.println("2.tomatoes --> 6$");
		System.out.println("3.mushroom --> 3$");
		System.out.println("4.jalaphno --> 6$");
		System.out.println("5.corn --> 3$");
		
		
	}
	void num_vegtoppings() {
		System.out.println("How many toppings you want to add in your pizza");
		int number= sc.nextInt();
		if(number == 1) {
			veg v = new veg();
			v.veg_display();
		}
		if(number == 2) {
			veg v1 = new veg();
			v1.veg_display2();
		}
			if(number == 3) {
				veg v2 = new veg();
				v2.veg_display3();
				
				
			}
			
		}
	void num_nonvegtoppings() {
		System.out.println("How many toppings you want to add in your pizza");
		int number= sc.nextInt();
		if(number == 1) {
			nonveg n = new nonveg();
			n.veg_display();
		}
		if(number == 2) {
			nonveg n1 = new nonveg();
			n1.veg_display2();
		}
			if(number == 3) {
				nonveg n2 = new nonveg();
				n2.veg_display3();
				
				
			}
			
		}
	void Margherita() {
		System.out.println("How many toppings you want to add in your pizza");
		int number= sc.nextInt();
		if(number == 1) {
			Margherita m = new Margherita();
			m.mar_display();
		}
		if(number == 2) {
			Margherita m1 = new Margherita();
			m1.mar_display2();
		}
			if(number == 3) {
				Margherita m2 = new Margherita();
				m2.mar_display3();
				
				
			}
			
		}
		
	}

	


