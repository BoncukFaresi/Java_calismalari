
public class Main {

	public static void main(String[] args) {
		Pizza pizza = new Pizza("Thicc crust","tomato","mozzerella","pepperoni");
		
		System.out.println("Here are the ingredients of yout pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.Topping);
		
		Pizza pizza2 = new Pizza("Thicc crust","tomato","mozzerella");
		System.out.println("Here are the ingredients of your pizza2: ");
		System.out.println(pizza2.bread);
		System.out.println(pizza2.sauce);
		System.out.println(pizza2.cheese);
		System.out.println(pizza2.Topping);


		Pizza pizza3 = new Pizza("Thicc crust","tomato");
		System.out.println("Here are the ingredients of your pizza3: ");
		System.out.println(pizza3.bread);
		System.out.println(pizza3.sauce);
		System.out.println(pizza3.cheese);
		System.out.println(pizza3.Topping);
	}

}
