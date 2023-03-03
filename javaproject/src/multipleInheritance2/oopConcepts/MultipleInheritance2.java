package multipleInheritance2.oopConcepts;

public class MultipleInheritance2 {
	public static void main(String args[]) {
	DComputer dcom=new DComputer();
	dcom.turnOn();
	dcom.switchOn();
	}
}
class DComputer implements Mon, Tv{

	public void switchOn() {
		System.out.println("Mon switched on..");
	}
	public void turnOn(){
		System.out.println("Tv turned on");
	}
	
	
}
interface Mon{
	void switchOn();
	
}
interface Tv{
	void turnOn();
}