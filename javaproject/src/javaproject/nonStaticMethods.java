package javaproject;

public class nonStaticMethods {
	public nonStaticMethods() {
		System.out.println("From constructor");
	}
	{
		System.out.println("from non static block");
	}
	public static void main(String args[]) {
		System.out.println("main method");
		nonStaticMethods obj1=new nonStaticMethods();
	}

}
