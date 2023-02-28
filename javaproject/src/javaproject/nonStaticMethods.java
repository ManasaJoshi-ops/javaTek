package javaproject;

public class nonStaticMethods {
	public nonStaticMethods() {
		System.out.println("From constructor");
	}
	static{
		System.out.println("from static block");
	}
	{
		System.out.println("from non static block");
	}
	public static void main(String args[]) {
		System.out.println("main method");
		nonStaticMethods obj1=new nonStaticMethods();
		nonStaticMethods obj2=new nonStaticMethods();
		car jsnd=new car();
		System.out.println(jsnd.colour);
		System.out.println(car.manufacturer);
	}

}
