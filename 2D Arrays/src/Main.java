
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] cars = new String[3][3];
		
		cars[0][0]="Camarro";
		cars[0][1]="Corvette";
		cars[0][2]="Silverado";
		cars[1][0]="Mustang";
		cars[1][1]="F-150";
		cars[1][2]="Ranger";
		cars[2][0]="Ferrari";
		cars[2][1]="Lambo";
		cars[2][2]="Tesla";
		
		for(int i = 0;i<cars.length;i++) {
			System.out.println();
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
			
		}
		
		String[][] cars2= {
							{"Camaro","Corvette","Silverado"},
							{"Mustang","Ranger","F-150"},
							{"Ferrari","Lambo","Tesla"}
						};
		for(int i = 0;i<cars2.length;i++) {
			System.out.println();
			for(int j=0;j<cars2[i].length;j++) {
				System.out.print(cars2[i][j]+" ");
			}
			
		}
		
	}

}
