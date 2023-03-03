package oopConcepts;

public class MultipleInheritance {
	public static void main(String args[]) {
		TV tv=new TV();
		tv.powerOn();
		Monitor mt=new Monitor();
		mt.powerOn();
		
		DesktopComputer dc=new DesktopComputer();
		dc.start1();
	}
}
class ElectronicDevices{
	void powerOn() {
		System.out.println("Electronic devices powered on..");
	}
}
class TV extends ElectronicDevices{
	void powerOn() {
		System.out.println("TV powered on..");
	}
}
class Monitor extends ElectronicDevices{
	void powerOn() {
		System.out.println("Monitor powered on...");
	}
}
class DesktopComputer implements I1, I2{

	
	public void start1() {
		I1.super.start1();
		I2.super.start1();
	}
		
	
	
}