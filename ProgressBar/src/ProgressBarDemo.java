import java.awt.*;
import javax.swing.*;
public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,500);
	
	ProgressBarDemo(){
		
		bar.setValue(500);
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true);
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		bar.setFont(new Font("MV Boli",Font.PLAIN,35));
		
			
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420,420);
		frame.setVisible(true);
		
		fill();
			
	}
	
	public void fill() {
		int i=500;
		while(i>=0) {
			bar.setValue(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i--;
		}
		bar.setString("YOU DIED");
		
	}
	
	
}
