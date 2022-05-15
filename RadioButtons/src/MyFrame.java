import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {

	JRadioButton pizza ;
	JRadioButton hamburger;
	JRadioButton hotdog;
	ButtonGroup group;
	
	MyFrame(){
		pizza = new JRadioButton();
		pizza.setText("Pizza");
		pizza.addActionListener(this);
		
		hamburger = new JRadioButton();
		hamburger.setText("Hamburger");
		hamburger.addActionListener(this);
		
		hotdog = new JRadioButton(); 
		hotdog.setText("Hotdog");
		hotdog.addActionListener(this);
		
		group = new ButtonGroup();
		group.add(hamburger);
		group.add(pizza);
		group.add(hotdog);
				
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(hamburger);
		this.add(hotdog);
		this.add(pizza);
		this.pack();
		this.setVisible(true);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizza) {
			System.out.println("You ordered a pizza");
		}
		else if(e.getSource()==hamburger) {
			System.out.println("You ordered a hamburger");
		}
		else if(e.getSource()==hotdog) {
			System.out.println("You ordered a hotdog");
		}
		
	}

}
