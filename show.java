package pizza_project;

import java.util.Scanner;

public class show extends pizza_menu {
	

	public void  display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------welcome---------------");
		System.out.println("We have 3 different types of pizza:");
		System.out.println("-----------A.veggi pizza -->15$----------");
		System.out.println("-----------B. Non-veg pizza -->18$-------");
		System.out.println("-----------C. Margherita pizza -->14$----");
		System.out.println("which pizza you want to order:--->");
		char option = sc.next().charAt(0);
		switch(option) {
		case 'A':
			toppings top = new toppings();
			top.veggi_pizza();
			break;
		case 'B':
			toppings top1 = new toppings();
			top1.nonveg_pizza();
			break;
		case 'C':
			toppings top2 = new toppings();
			top2.Margherita_pizza();
				
				
			}
			
		}
		
	}

