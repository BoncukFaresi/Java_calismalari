import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnaSayfa extends JFrame implements ActionListener {
	
	Personel personel;

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
		
		personelfr = new JButton("Personel i�lemleri");
		personelfr.addActionListener(this);
		
		hg = new JLabel("Ho� Geldiniz, "+conn.dbgetIsim(id));
		
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
		
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		System.exit(0);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==personelfr) {
			
				try {
					personel = new Personel();
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}			
			}
			
		}
		
	}


