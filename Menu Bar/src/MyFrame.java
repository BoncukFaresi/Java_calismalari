import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener {

	JMenuItem loaditem;
	JMenuItem save;
	JMenuItem exit;
	JLabel label;
	ImageIcon loadicon;
	ImageIcon saveicon;
	
	MyFrame(){
		label = new JLabel();
		label.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		loadicon = new ImageIcon(new ImageIcon("das.png").getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT));
		saveicon = new ImageIcon(new ImageIcon("Screenshot_63.png").getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT));
		
		JPanel panel1 = new JPanel();
		
		panel1.setLayout(new BorderLayout());
		
		
		JMenuBar bar = new JMenuBar();
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu help = new JMenu("Help");
		
		loaditem = new JMenuItem("Load");
			loaditem.addActionListener(this);
			loaditem.setIcon(loadicon);
		save = new JMenuItem("Save");
			save.addActionListener(this);
			save.setIcon(saveicon);
		exit = new JMenuItem("Exit");
			exit.addActionListener(this);
				
		file.add(loaditem);
		file.add(save);
		file.add(exit);
		
		bar.add(file);
		bar.add(edit);
		bar.add(help);
		
		panel1.add(label);
		
		this.add(panel1,BorderLayout.NORTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());;
		this.setSize(500,500);
		this.setJMenuBar(bar);
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loaditem) {
			label.setText("You loaded a file");
		}
		else if(e.getSource()==save) {
			label.setText("You saved the file");
			
		}
		else if(e.getSource()==exit) {
			System.exit(0);
		}
		
	}

}
