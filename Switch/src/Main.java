import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String day = JOptionPane.showInputDialog(null,"What day is it");
		
		switch(day) {
		case "Sunday" : JOptionPane.showMessageDialog(null,"�t is sunday");
			break;
		case "Monday" : JOptionPane.showMessageDialog(null,"�t is monday");
			break;
		case "Thuesday" : JOptionPane.showMessageDialog(null,"�t is thuesday");
			break;
		case "Wednesday" : JOptionPane.showMessageDialog(null,"�t is Wednesday");
			break;
		case "Thursday" : JOptionPane.showMessageDialog(null,"�t is Thursday");
			break;
		case "Friday" : JOptionPane.showMessageDialog(null,"�t is Friday");
			break;
		case "Saturday" : JOptionPane.showMessageDialog(null,"�t is Saturday");
			break;
		default:JOptionPane.showMessageDialog(null,"Thats not even a day");break;
		}

	}

}
