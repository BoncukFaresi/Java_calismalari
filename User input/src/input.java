import java.util.Scanner;// scannere içeren dicti çaðýrýyoruz


public class input {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);//Scanner oluþturuyoruz
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();//scanner nesnesini kullanarak isimi alýyoruz
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();//nextInt metodu /n býraktýðý için scanneri temizlerken kullanýyoruz
		System.out.println("What is your favourite food? ");
		String food=scanner.nextLine();
		
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+food);
	}
}
