import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String day = JOptionPane.showInputDialog(null,"What day is it");
		
		switch(day) {
		case "Sunday" : JOptionPane.showMessageDialog(null,"Ýt is sunday");
			break;
		case "Monday" : JOptionPane.showMessageDialog(null,"Ýt is monday");
			break;
		case "Thuesday" : JOptionPane.showMessageDialog(null,"Ýt is thuesday");
			break;
		case "Wednesday" : JOptionPane.showMessageDialog(null,"Ýt is Wednesday");
			break;
		case "Thursday" : JOptionPane.showMessageDialog(null,"Ýt is Thursday");
			break;
		case "Friday" : JOptionPane.showMessageDialog(null,"Ýt is Friday");
			break;
		case "Saturday" : JOptionPane.showMessageDialog(null,"Ýt is Saturday");
			break;
		default:JOptionPane.showMessageDialog(null,"Thats not even a day");break;
		}

	}

}
