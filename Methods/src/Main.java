
public class Main {

	public static void main(String[] args) {
		
		hello();
		
		String name="Bro";
		helloto(name);
		
		int age = 22;
		hellotoa(name,age);
		
		int x=3;
		int y=4;
		
		System.out.println(add(3,4));
		
		int z=add2(x,y);
		System.out.println(z);
		
		
	}
	
	static void hello() {
		System.out.println("Hello");
	 	}
	
	static void helloto(String a) {
		System.out.println("Hello "+a);
	 	}
	
	static void hellotoa(String name,int age) {
		System.out.println("Hello "+name+"\nYour age: "+age);
	 	}
	
	
	static int add(int a,int b) {
		int c =a+b;
		return c;
	 	}
	
	static int add2(int a,int b) {
		return a+b;
	 	}


}
