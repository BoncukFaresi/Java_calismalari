
public class Main {

	public static void main(String[] args) {
		Hero hero1=new Hero("Batman",42,"$$$");
		
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);
		
		Hero hero2 = new Hero("Superman", 43, "Unlimted power");
		
		System.out.println(hero2.name);
		System.out.println(hero2.age);
		System.out.println(hero2.power);
		
		System.out.println("----------------With super");
		
		System.out.println(hero1);
		
		System.out.println("----------------With super");
		
		
		System.out.println(hero2);
		

	}

}
