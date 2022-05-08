
public class Car {
	private String make;
	private String model;
	private int year;
	
	Car(String make,String model,int year){
		setMake(make);
		setModel(model);
		setYear(year);
	}
	Car(Car x){
		this.copy(x);
	}
	
	public String toString() {
		return this.getMake()+"\n"+this.getModel()+"\n"+this.getYear()+"\n";
	}
	
	public String getMake() {
		return this.make;
	}
	 public void setMake(String make) {
		this.make=make;
	}
	
	public String getModel() {
		return this.model;
	}
	 public void setModel(String model) {
		this.model=model;
	}
	
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	public void copy(Car car) {
		this.setMake(car.getMake());
		this.setModel(car.getModel());
		this.setYear(car.getYear());
	}
}
