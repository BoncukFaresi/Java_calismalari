
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "    Bro    ";
		
		boolean result  =name.equals("bro");
		boolean result2 =name.equalsIgnoreCase("bro");
		
		System.out.println(result);
		System.out.println(result2);
		
		int result3 =name.length();
		char result4=name.charAt(4);
		
		System.out.println(result3);
		System.out.println(result4);
		
		int result5 =name.indexOf("B");
		boolean result6 =name.isEmpty();
		
		System.out.println(result5);
		System.out.println(result6);
		
		String result7 =name.toUpperCase();
		String result8 =name.toLowerCase();
		
		System.out.println(result7);
		System.out.println(result8);
		
		String result9 =name.trim();
		String result10 =name.replace("o","uh");
		
		System.out.println(result9);
		System.out.println(result10);
		
	}

}
