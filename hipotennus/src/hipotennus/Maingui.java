package hipotennus;

import javax.swing.JOptionPane;

public class Maingui {
	public static void main(String[] args) {
		double x = Double.parseDouble(JOptionPane.showInputDialog("X kenar�n� giriniz"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Y kenar�n� giriniz"));
		
		double z = Math.sqrt((x*x)+(y*y));
		
		JOptionPane.showInternalMessageDialog(null, "��genin hipoten�s� :"+z);
	}

}
