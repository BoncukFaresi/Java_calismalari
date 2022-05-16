import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{

	JLabel label;
	ImageIcon bora;
	MyFrame(){
		bora = new ImageIcon(new ImageIcon("das.png").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.addKeyListener(this);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setIcon(bora);
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		
		this.add(label);
		this.setLayout(null);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar()) {
		case 'a':label.setLocation(label.getX()-10, label.getY());break;
		case 'd':label.setLocation(label.getX()+10, label.getY());break;
		case 's':label.setLocation(label.getX(), label.getY()+10);break;
		case 'w':label.setLocation(label.getX(), label.getY()-10);break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 37:label.setLocation(label.getX()-10, label.getY());break;
		case 39:label.setLocation(label.getX()+10, label.getY());break;
		case 40:label.setLocation(label.getX(), label.getY()+10);break;
		case 38:label.setLocation(label.getX(), label.getY()-10);break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you relased that key : "+e.getKeyChar());
		System.out.println("you relased that key code : "+e.getKeyCode());
	}
}
