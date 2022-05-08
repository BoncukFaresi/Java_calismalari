package hipotennus;

import javax.swing.JOptionPane;

public class Maingui {
	public static void main(String[] args) {
		double x = Double.parseDouble(JOptionPane.showInputDialog("X kenarýný giriniz"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Y kenarýný giriniz"));
		
		double z = Math.sqrt((x*x)+(y*y));
		
		JOptionPane.showInternalMessageDialog(null, "Üçgenin hipotenüsü :"+z);
	}

}
