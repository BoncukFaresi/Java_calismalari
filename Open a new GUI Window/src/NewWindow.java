import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow implements ActionListener{

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton button = new JButton("Fuck go back");
	
	NewWindow(){
		
		button.setBounds(100,160,200,40);
		button.setFocusable(false);
		button.addActionListener(this);
		
		label.setText("Hello");
		label.setBounds(0, 0, 100, 100);
		label.setFont(new Font(null,Font.PLAIN,25));
		label.setLayout(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.add(button);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			frame.dispose();
			LaunchPage launch = new LaunchPage();
		}
	}
	
}
