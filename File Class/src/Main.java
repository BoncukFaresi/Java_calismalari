import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("secret_message.txt");
		
		//File file2 = new File("C:\\Users\\mehme\\Desktop\\secret_message.txt");
		
		if(file.exists()) {
			System.out.println("That file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
			
			
		}
		else {
			System.out.println("This file doesn't exist");
		}
		
		
		//if(file2.exists()) {
			//System.out.println("That file exists");
		//}
		//else {
		//	System.out.println("This file doesn't exist");
		//}
	}

}
