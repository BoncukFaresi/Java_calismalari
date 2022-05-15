import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	JButton button ;
	JButton buttons ;
	JTextField textf ;
	
	MyFrame(){
		
		button = new JButton("Choose a File");
		button.addActionListener(this);
		
		buttons = new JButton("Save File");
		buttons.addActionListener(this);
		
		textf = new JTextField();
		textf.setPreferredSize(new Dimension(250,40));
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(textf);
		this.add(button);
		this.add(buttons);
		this.pack();
		this.setVisible(true);
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JFileChooser chooser = new JFileChooser();
			chooser.setCurrentDirectory(new File("."));
			int response = chooser.showOpenDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(chooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}else if(e.getSource()==buttons) {
			JFileChooser saver = new JFileChooser();
			saver.setCurrentDirectory(new File("."));
			int sres = saver.showSaveDialog(null);
			
			if(sres == JFileChooser.APPROVE_OPTION) {
				File savefile = new File(saver.getSelectedFile().getAbsolutePath());
				System.out.println(savefile);
				
				try {
					FileWriter writer = new FileWriter(savefile+".txt");
					writer.write(textf.getText());
					writer.close();
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
	
		
	}

}
