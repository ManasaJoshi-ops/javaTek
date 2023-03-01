package oopConcepts;

public class ConstructorChaining {
	public static void main(String args[]) {
		ChildClass cc=new ChildClass();
	}
}
class SuperClass{
	int x;
	SuperClass(){
		System.out.println("No args super class constructor");
	}
	SuperClass(int x){
		this.x=x;
		System.out.println("One arg super class constructor");
	}
}

class ChildClass extends SuperClass{
	ChildClass(){
		this(10);
		System.out.println("No args child class constructor");
	}
	ChildClass(int y){
		super(y);
		System.out.println("One arg child class constructor");
	}
}
