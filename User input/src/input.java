import java.util.Scanner;// scannere i�eren dicti �a��r�yoruz


public class input {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);//Scanner olu�turuyoruz
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();//scanner nesnesini kullanarak isimi al�yoruz
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();//nextInt metodu /n b�rakt��� i�in scanneri temizlerken kullan�yoruz
		System.out.println("What is your favourite food? ");
		String food=scanner.nextLine();
		
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+food);
	}
}
