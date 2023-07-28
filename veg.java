package pizza_project;

import java.util.Scanner;

public class veg extends pizza_menu{
	pizza_menu p = new pizza_menu();
	Scanner sc = new Scanner(System.in);
	int total;
	int total2;
	int total3;
	void veg_display() {
		System.out.println("select your first topping:--------");
		String topping1 = sc.next();
		if(topping1.equals("onion")) {
		 total = p.add(veg, onion);
		}
		if(topping1.equals("tomatoes")) {
			total = p.add(veg, tomatoes);
		}
		if(topping1.equals("mushroom")) {
			total = p.add(veg, mushroom);
		}
		if(topping1.equals("jalaphno")) {
			total = p.add(veg, jalaphno);
		
		}
		if(topping1.equals("corn")) {
			total = p.add(veg, corn);
		
		}
		}
	void veg_display2() {
		veg_display();
		System.out.println("select your second topping:-----------");
		String topping2 = sc.next();
		if(topping2.equals("onion")) {
			total2 = p.add(total, onion);
			
		}
		if(topping2.equals("tomatoes")) {
			total2 = p.add(total, tomatoes);
		}
		if(topping2.equals("mushroom")) {
			total2 = p.add(total, mushroom);
		}
		if(topping2.equals("jalaphno")) {
			total2 = p.add(total, jalaphno);
		
		}
		if(topping2.equals("corn")) {
			total2 = p.add(total, corn);
		
		}

			
		}
	void veg_display3() {
		veg_display2();
		System.out.println("select your third topping:--------------");
		String topping2 = sc.next();
		if(topping2.equals("onion")) {
			total3 = p.add(total2, onion);
		}
		if(topping2.equals("tomatoes")) {
			total3 =p.add(total2, tomatoes);
		}
		if(topping2.equals("mushroom")) {
			total3 = p.add(total2, mushroom);
		}
		if(topping2.equals("jalaphno")) {
			total3 = p.add(total2, jalaphno);
		
		}
		if(topping2.equals("corn")) {
			total3 = p.add(total2, corn);
		
		}

			
		}
		
	}
