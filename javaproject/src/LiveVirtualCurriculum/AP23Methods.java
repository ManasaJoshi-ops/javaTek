package LiveVirtualCurriculum;

public class AP23Methods {
public static void main(String[] args) {
	System.out.println("From Main method");
	method1();
	AP23Methods me=new AP23Methods();
	me.method2();
}
	static void method1() {
		 System.out.println("From Static method");
	 }
	void method2() {
		 System.out.println("From NonStatic method");
	 }
}
