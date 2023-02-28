package javaproject;

public class staticAndNonStaticMethods {
	public static void main(String args[]) {
		System.out.println("main method");
		method1();
		method2();
//		method3();
		staticAndNonStaticMethods obj =new staticAndNonStaticMethods();
		obj.method3();
	}
	static void method1() {
		System.out.println("static method1");
	}
	static void method2() {
		System.out.println("static method2");
	}
    void method3() {
		System.out.println("nonstatic method");
	}

}
