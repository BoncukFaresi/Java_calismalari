import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		int i = 0;
		
		while(i <=10) {
			int x = random.nextInt(1,6);
			double y = random.nextDouble();
			boolean z = random.nextBoolean();
			System.out.println(i+". Ýnt: "+x+"   0-1:  "+y+"   Boolean: "+z);
			i++;
		}
		
		

	}

}
