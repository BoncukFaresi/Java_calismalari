
public class Main {

	public static void main(String[] args) {
		 
		Car myCar1 = new Car();
		
		System.out.println(myCar1.model);
		System.out.println(myCar1.make);
		System.out.println(myCar1.Color);
		
		myCar1.drive();
		myCar1.brake();
		
		Car myCar2 = new Car();
		
		myCar2.model="Cruise";
		
		System.out.println(myCar2.model);
		System.out.println(myCar2.make);

	}

}
