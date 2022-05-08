package hipotennus;

public class Maths {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		
		double z =Math.max(x, y);//max deðeri alýr
		double k =Math.min(x, y);//min deðeri alýr
		double l =Math.abs(y);//mutlak deðeri alýr
		double s =Math.sqrt(x);//karekök alýr
		double r =Math.round(x);//yuvarlar
		double c =Math.ceil(x);//üst tabana yuvarlar
		double f =Math.floor(x);//alt atabana yuvarlar
		
		System.out.println(z);
		System.out.println(k);
		System.out.println(l);
		System.out.println(s);
		System.out.println(r);
		System.out.println(c);
		System.out.println(f);

	}

}
