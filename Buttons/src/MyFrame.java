import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	JLabel label;
		
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("das.png");
		ImageIcon icon2 = new ImageIcon (new ImageIcon("Screenshot_63.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
		
		
		
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(75, 350,300, 300);
		label.setVisible(false);
		
		
		button = new JButton();
		button.setBounds(100, 100, 250, 250);
		//button.addActionListener(e -> System.out.println("poo"));
		button.addActionListener(this);
		button.setText("I am a Button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(0);
		button.setForeground(Color.cyan);
		button.setBackground(Color.gray);
		button.setBorder(BorderFactory.createEtchedBorder());
		button.setEnabled(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1000,1000);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("poo");
			button.setEnabled(false);
			label.setVisible(true);
		}
		
	}
}
