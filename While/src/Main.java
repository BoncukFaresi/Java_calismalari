import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String name ="";
		String surname ="";
		
		while(name.isBlank()) {
			System.out.print("Enter Name: ");
			name=scanner.nextLine();
		}
		do {
			System.out.print("Enter Your Surname: ");
			surname=scanner.nextLine();
		}while(surname.isBlank());
		
		name=name.substring(0, 1).toUpperCase()+name.substring(1);
		scanner.close();
		
		System.out.print("Hello "+name);
		System.out.println(" "+surname.toUpperCase(Locale.getDefault()));
		

	}

}

