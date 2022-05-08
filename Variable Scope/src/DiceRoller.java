import java.util.Random;

public class DiceRoller {
	Random rnd;
	int num;
	
	DiceRoller(){
		Random rnd = new Random();
		int num = 0;
		roll();
		roll(rnd,num);
		
		
	}
	void roll() {
		num = rnd.nextInt(6)+1;
		System.out.println(num);
		
	}
	void roll(Random rnd,int num) {
		num = rnd.nextInt(6)+1;
		System.out.println(num);
	}
	
	
	
}
