import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener  {

	JButton button;
	JLabel label;
	JCheckBox box;
	ImageIcon image1;
	ImageIcon image2;
	
	MyFrame(){
		button=new JButton("submit");
		button.setFocusable(false);
		button.addActionListener(this);
		
		image1 = new ImageIcon(new ImageIcon("das.png").getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT));
		image2 = new ImageIcon(new ImageIcon("screenshot_63.png").getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT));
		
		box = new JCheckBox();
		box.setText("I am not a robot");
		box.setFocusable(false);
		box.setFont(new Font("Calibri",Font.BOLD,25));
		box.setIcon(image2);
		box.setSelectedIcon(image1);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());		
		this.add(button);
		this.add(box);
		this.pack();
		this.setVisible(true);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(box.isSelected());
		}
		
	}
	
}
