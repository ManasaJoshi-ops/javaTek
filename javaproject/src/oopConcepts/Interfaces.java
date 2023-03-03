package oopConcepts;

public class Interfaces {
	public static void main(String args[]) {
		Honda honda=new Honda();
		honda.go();
		honda.stop();
	}
}
interface Carr{
	void go();
	void stop();
}
class Honda implements Carr{
	public void go() {
		System.out.println("Inside Honda, go()..");
	}
	public void stop() {
		System.out.println("Inside Honda, stop()..");
	}
}


