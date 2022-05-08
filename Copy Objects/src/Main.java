
public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet","Camaro",2021);
		Car car2 = new Car("Ford","Mustang",2022);
		
		car2.copy(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		
		Car car3 = new Car(car1);
		
		System.out.println(car3);
	}

}
