import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnaSayfa extends JFrame implements ActionListener {

	JPanel sgPanel;
	JPanel altPanel;
	
	JButton personelfr; 
	JButton stok;
	JButton islem;
	JButton Muhasebe;
	dbConnect conn;
	
	JLabel hg;
	
	AnaSayfa(int id) throws SQLException{
		dbConnect conn = new dbConnect();			
		
		int yetki =conn.dbgetYetki(id);
		ImageIcon icon = new ImageIcon("das.png");
		
		personelfr = new JButton("Personel iþlemleri");
		personelfr.addActionListener(this);
		
		hg = new JLabel("Hoþ Geldiniz, "+conn.dbgetIsim(id));
		
		sgPanel = new JPanel();
		sgPanel.setLayout(new GridLayout(5,1,10,10));
		sgPanel.setBackground(Color.LIGHT_GRAY);
		sgPanel.setPreferredSize(new Dimension(200,200));
		sgPanel.add(personelfr);
		
		altPanel = new JPanel();
		altPanel.setLayout(new FlowLayout());
		altPanel.setBackground(Color.gray);
		altPanel.setPreferredSize(new Dimension(100,30));
		altPanel.setBorder(BorderFactory.createLoweredBevelBorder());
		altPanel.add(hg);
		
				
		this.setDefaultCloseOperation();
		this.setLayout(new BorderLayout(10,10));
		this.setSize(500,300);
		this.setTitle("Ana Sayfa");
		this.setIconImage(icon.getImage());
		this.add(altPanel,BorderLayout.SOUTH);
		this.add(sgPanel,BorderLayout.EAST);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		if(yetki>0) {
			personelfr.setEnabled(false);
		}
	}
	
	private void setDefaultCloseOperation() {
		this.dispose();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
