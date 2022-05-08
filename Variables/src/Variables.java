
public class Variables {

	public static void main(String[] args) {
		int x = 123;
		double y= 3.14; 
		boolean z = true;
		char symbol='@';
		String name="mehmet";
		
		System.out.println("my number is:"+ x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(symbol);
		System.out.println(name);
		
		
		String w="water";
		String k="Kool-Aid";
		String tmp;
		
		System.out.println("w : "+w);
		System.out.println("k : "+k);
		
		tmp=w;
		w=k;
		k=tmp;
		
		System.out.println("w : "+w);
		System.out.println("k : "+k);
	}

}
