import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		int age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Your Age"));
		
		if(age>=75) {
			JOptionPane.showMessageDialog(null, "OK BOOMER !!!");
		}
		
		else if(age>=18) {
			JOptionPane.showMessageDialog(null,"You are an Adult");
		}
		
		else if(age>=12) {
			JOptionPane.showMessageDialog(null, "You are not Adult!!");
		}
		
		else {
			JOptionPane.showMessageDialog(null,"Oh Baby Baby");
		}
	}
}
