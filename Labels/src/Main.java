import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {

		ImageIcon ?mage = new ImageIcon("das.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel();
		label.setText("Bro Do you even code?");
		label.setIcon(?mage);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x00FF00));
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setIconTextGap(20);
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(50,50,350,350);
		

		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.getContentPane().setBackground(new Color(0xAAAAAA));
		frame.pack();
		

	}

}
