package oopConcepts;

public class ConstructorChaining {
	public static void main(String args[]) {
		ChildClass cc=new ChildClass(5);
		
	}
}
class SuperClass{
	int x;
	SuperClass(){
		System.out.println("No args superclass constructor");
	}
	SuperClass(int x){
		this.x=x;
		System.out.println("One arg superclass constructor");
	}
}
class ChildClass extends SuperClass {
	int y;
	ChildClass(){
		this(10);
		System.out.println("No args child class constructor");
	}
	ChildClass(int y){
		super(y);
		System.out.println("One arg child class constructor");
	}
}