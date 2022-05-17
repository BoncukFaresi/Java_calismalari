import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;



public class dbConnect {
	static Connection con;
	static Statement mystat;
	static ResultSet myres;
	
	dbConnect() throws SQLException{
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/muhasebe","root","1234");
		mystat = (Statement) con.createStatement();
		
	}
	
	public boolean dbContainUser(String user) throws SQLException {
		myres = null;
		
		myres =mystat.executeQuery("SELECT username FROM muhasebe.personel_giris ;");
		ArrayList<String> usrnms = new ArrayList<String>();
		
		while(myres.next()) {
			usrnms.add(myres.getString("username"));
		}
		
		return usrnms.contains(user);
		
	}
	
	
public boolean dbPasswordCheck(String pass) throws SQLException {
		myres=null;
		myres =mystat.executeQuery("SELECT password FROM muhasebe.personel_giris ;");
		ArrayList<String> pases = new ArrayList<String>();
		
		while(myres.next()) {
			pases.add(myres.getString("password"));
		}
		
		return pases.contains(pass);
	}
	
public int dbid(String user) throws SQLException {
		
		myres = mystat.executeQuery("SELECT personel_id FROM muhasebe.personel_giris WHERE username="+"'"+user+"'"+" ;");
		ArrayList<Integer> id = new ArrayList<Integer>();
		int i = 0;
		while(myres.next()) {
			if (i == 1) {
				System.out.println("id iki giriþ oldu i = "+i);//hata mesajý
				System.exit(0);
			}
			else {
				id.add(myres.getInt("personel_id"));
			}
			i++;
		}
		
		return id.get(0) ; 
	}
	
public String dbgetIsim(int id) throws SQLException {
		myres = mystat.executeQuery("SELECT ad,soyad FROM muhasebe.personel WHERE personel_id="+id+";");
		ArrayList<String>	isim = new ArrayList<String>();
		while(myres.next()) {
			isim.add(myres.getString("ad"));
			isim.add(myres.getString("soyad"));
		}
		return isim.get(0)+" "+isim.get(1)+" ";
	}
	
public int dbgetYetki(int id) throws SQLException {
		myres = mystat.executeQuery("SELECT yetki FROM muhasebe.personel WHERE personel_id="+id+";");
		ArrayList<Integer> yetki = new ArrayList<Integer>();
		while(myres.next()) {
			yetki.add(myres.getInt("yetki"));
		}
		return yetki.get(0);
	}
}













