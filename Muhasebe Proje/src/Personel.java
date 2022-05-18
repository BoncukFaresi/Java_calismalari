import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Personel extends JFrame implements ActionListener{
	dbConnect conn;
	
	
	JPanel solPanel;
	JPanel sagPanel;
	JPanel tabloPanel;
	JPanel girisPanel;
	JPanel aramaPanel;
	JPanel butonPanel;
	
	JTable tablo;
	
	JScrollPane scrol;

	Personel() throws SQLException{
		conn = new dbConnect();
		
		String[] col= {"ID","Ýsim","SoyÝsim","Maaþ","Telefon Numarasý","Görev"};
		
		
		
		solPanel = new JPanel();
		solPanel.setPreferredSize(new Dimension(600,700));
		
		sagPanel = new JPanel();
		sagPanel.setPreferredSize(new Dimension(400,700));
		
		tabloPanel = new JPanel();
		tabloPanel.setPreferredSize(new Dimension(600,500));
		tabloPanel.setLayout(new FlowLayout());
		tabloPanel.setBackground(Color.gray);
		solPanel.add(tabloPanel);
		
		girisPanel = new JPanel();
		girisPanel.setPreferredSize(new Dimension(400,400));
		girisPanel.setLayout(new GridLayout(6,2, 0,0));
		girisPanel.setBackground(Color.LIGHT_GRAY);
		sagPanel.add(girisPanel);
		
		aramaPanel=new JPanel();
		aramaPanel.setPreferredSize(new Dimension(600,200));
		aramaPanel.setLayout(new FlowLayout());
		aramaPanel.setBackground(Color.lightGray);
		solPanel.add(aramaPanel);
		
		butonPanel = new JPanel();
		butonPanel.setPreferredSize(new Dimension(400,300));
		butonPanel.setLayout(new GridLayout(2,3,10,10));
		butonPanel.setBackground(Color.gray);
		sagPanel.add(butonPanel);
		
		scrol = new JScrollPane();
		scrol.setPreferredSize(new Dimension(580,480));
		tabloPanel.add(scrol);
		
		tablo = new JTable(conn.dbGetPersonel(),col);
		tablo.setPreferredSize(new Dimension(580,480));
		scrol.setViewportView(tablo);
		
		
		
		this.setDefaultCloseOperation();
		this.setSize(1000,700);
		this.setLayout(new BorderLayout(0,0));
		this.add(solPanel,BorderLayout.WEST);
		this.add(sagPanel,BorderLayout.EAST);
		this.setVisible(true);
	}

	private void setDefaultCloseOperation() throws SQLException {
		this.dispose();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
