import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		String[] animals = {"cat","dog","rat","bird"};
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		ArrayList<String> animals2 = new ArrayList<String>();
		
		animals2.add("cat");
		animals2.add("dog");
		animals2.add("rat");
		animals2.add("bird");
		
		System.out.println(animals2);

	}

}
