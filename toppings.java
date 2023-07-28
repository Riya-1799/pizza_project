package pizza_project;

public class toppings extends pizza_menu {
	void veggi_pizza() {
		toppings_display td = new toppings_display();
		td.display();
		td.num_vegtoppings();
		
	}
	void nonveg_pizza() {
		toppings_display td1 = new toppings_display();
		td1.display();
		td1.num_nonvegtoppings();
		
	}
	void Margherita_pizza() {
		toppings_display td2 = new toppings_display();
		td2.display();
		td2.Margherita();
	}
}
