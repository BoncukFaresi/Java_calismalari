import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//JOptionPane.showMessageDialog(null,"This some useless info","Plain",JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null,"This more useless info","�nfo",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"Really ?","Question",JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"Your computer has a V�RUS!!!","Warning",JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null,"Call tech support NOW OR ELSE!!!","Error",JOptionPane.ERROR_MESSAGE);
		
		//JOptionPane.showInternalOptionDialog(null,"Secret Message" ,"You Are Awsome", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, null, null, 0);
		
		/*int answer =JOptionPane.showConfirmDialog(null,"Bro do you even code? ","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);//yes = 0   no = 1   cancel = 2     x = -1
		String name = JOptionPane.showInputDialog("What is your name?");
		if (name==null) {
			JOptionPane.showMessageDialog(null,"Dont go...",":(",JOptionPane.WARNING_MESSAGE);
		}
		else {
			switch(answer) {
				case(0):JOptionPane.showMessageDialog(null,"Whooaaa!!! You can really code "+name.toUpperCase()+" !!!!","EXC�T�NG",JOptionPane.WARNING_MESSAGE);break;
				case(1):JOptionPane.showMessageDialog(null,"LOOOSER "+name+"...","DUDE",JOptionPane.WARNING_MESSAGE);
				case(2):JOptionPane.showMessageDialog(null,"Don't worry just gimme answer "+name.toUpperCase()+" .","OH!!",JOptionPane.WARNING_MESSAGE);break;
				default:JOptionPane.showMessageDialog(null,"Where did you go coward "+name.toUpperCase()+"?","F@CK!!",JOptionPane.WARNING_MESSAGE);break;
			}
		}*/
		
		String[] responses = {"No, You're awsome!","Thank you!","Yamete kudasai"};
		
		ImageIcon icon = new ImageIcon(new ImageIcon("indir.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		
		JOptionPane.showInternalOptionDialog(null,"You Are Awsome" ,"Secret Message", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon, responses, 2);
	}

}
