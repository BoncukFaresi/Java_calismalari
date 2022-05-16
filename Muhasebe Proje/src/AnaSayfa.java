import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class AnaSayfa extends JFrame implements ActionListener {

	
	AnaSayfa(){
		ImageIcon icon = new ImageIcon("das.png");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setTitle("Ana Sayfa");
		this.setIconImage(icon.getImage());
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	private void setDefaultCloseOperation() {
		this.dispose();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
