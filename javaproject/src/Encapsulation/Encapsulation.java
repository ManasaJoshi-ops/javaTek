package Encapsulation;

public class Encapsulation {
	public static void main(String args[]) {
		Car car=new Car();
		car.SetColour("white");
		System.out.println(car.getColour());
		System.out.println(car.getNumOfWheels());
		
	}

}
class Car{
	private String colour;
	private int numOfWheels;
	public static String manufacturer="Honda";
	public boolean customisable;
	
	public Car() {
		numOfWheels=4;
		colour="red";
		customisable=true;
	}
	public String getColour() {
		return this.colour;
	}
	public void SetColour(String colour) {
		this.colour=colour;
	}
	public int getNumOfWheels() {
		return this.numOfWheels;
	}
	public void SetNumOfWheels(int numOfWheels) {
		this.numOfWheels=numOfWheels;
	}
}

