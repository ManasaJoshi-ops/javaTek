package oopConcepts;
public class imheritance {
	//multilevel inheritance
	public static void main(String args[]) {
		JDK8 obj=new JDK8();
		obj.f1();
		obj.f3();
		
	}
}
	class JDK6{
		JDK6(){
			System.out.println("Installing JDK6");
		}
		void f1(){
			System.out.println("Inside JDK6 f1 method");
		}
	}
	class JDK7 extends JDK6 {
		JDK7(){
			System.out.println("Installing JDK7");
		}
	}
	class JDK8 extends JDK7{
		JDK8(){
			System.out.println("Installing JDK8");
		}
		void f3(){
			System.out.println("Inside JDK8 f3 method");
		}
	}


