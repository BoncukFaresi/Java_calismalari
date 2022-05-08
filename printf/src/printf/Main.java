package printf;

public class Main {

	public static void main(String[] args) {
		System.out.printf("this is a format string %d\n",123);
		System.out.printf("this is a format string %s\n","hello");
		
		boolean myboo=true;
		char mychar='@';
		String mystring="Bro";
		int myint=50;
		double mydouble=1000;
		
		System.out.printf("%b\n",myboo);
		System.out.printf("%s\n",mystring);
		System.out.printf("%c\n",mychar);
		System.out.printf("%d\n",myint);
		System.out.printf("%f\n",mydouble);
		
		System.out.printf("Hello %10s\n",mystring);
		
		System.out.printf("%.2f\n",mydouble);
		
		System.out.printf("%-20f\n",mydouble);
		System.out.printf("%20f\n",mydouble);
		System.out.printf("%+f\n",mydouble);
		//System.out.printf("%-f\n",mydouble);
		System.out.printf("%020f\n",mydouble);
		System.out.printf("%,f\n",mydouble);
		

	}

}
