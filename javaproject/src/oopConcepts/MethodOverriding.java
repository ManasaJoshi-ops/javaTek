package oopConcepts;

public class MethodOverriding {
	public static void main(String args[]) {
		Buss bus =new Buss(1,2,3,4);
		bus.energy();
//		Carr car =new Carr();
//		car.energy();
	}

}
class Veh{
	int a,b;
	Veh(int a , int b){
		this.a=a;
		this.b=b;
	}
	void energy() {
		System.out.println("Petrol");
	}
}
class Buss extends Veh{
	int c, d;
//	Buss(int c, int d){
//		super(0,0);  // for the sake of its parent class parameters, so inititialize to 0
	Buss(int a, int b, int c, int d){
		super(a,b);
	this.c=c;
		this.d=d;
	}
	void energy() {   //overridden
		super.energy();
		System.out.println("CNG");
	}
	
}
//class Carr extends Veh{
//	
//}
//class Bikee extends Veh{
//	
//}
