import java.util.Random;

public class Merak {
	public static void main(String[] args) {
		Random rnd=new Random();
		int i = 1;
		int a = 0;
		int b = 0;
		
		while(i<=1000) {
			boolean x =rnd.nextBoolean();
			if(x==true) {
				a++;
			}
			else {
				b++;
			}
			i++;
		}
		System.out.println("True = "+a+"  False = "+b);
	}
}
