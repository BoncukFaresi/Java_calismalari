import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> bakerylist=new ArrayList<String>();
		bakerylist.add("pasta");
		bakerylist.add("garlic bread");
		bakerylist.add("donuts");
		
		System.out.println(bakerylist.get(0));
		
		ArrayList<String> producelist=new ArrayList<String>();
		producelist.add("tomatoes");
		producelist.add("zuchini");
		producelist.add("peppers");
		
		ArrayList<String> drinkslist=new ArrayList<String>();
		drinkslist.add("soda");
		drinkslist.add("coffe");
		
		ArrayList<ArrayList<String>> grocerylist=new ArrayList<ArrayList<String>>();
		grocerylist.add(bakerylist);
		grocerylist.add(producelist);
		grocerylist.add(drinkslist);
		
		System.out.println(grocerylist);
		System.out.println(grocerylist.get(0));
		System.out.println(grocerylist.get(1).get(2));
	}

}
