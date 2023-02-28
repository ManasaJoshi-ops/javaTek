package oopConcepts;

public class hierarchialInheritance {
	public static void main(String args[]) {
//		car obj1=new car();
//		obj1.methodV();
//		obj1.methodC();
//		
//		bike obj2=new bike();
//		obj2.methodV();
//		obj2.methodB();
		
		car obj=new car();
		System.out.println(obj.fuel());
		bus obj2=new bus();
		System.out.println(obj2.fuel());
		bike obj3=new bike();
		System.out.println(obj3.fuel());
//		
//	}
	}
	}
//	class vehicle{
//		void methodV() {
//			System.out.println("This is a Vehicle class method");
//		}
//	}
//	class car extends vehicle{
//		void methodC() {
//			System.out.println("This is a Car class method... it inherits from vehicle");
//		}
//	}
//	class bike extends vehicle{
//		void methodB() {
//			System.out.println("This is a Bike class method ... it inherits from vehicle class");
//		}
	
	class vehicle{
		String fuel() {
			return "Petrol";
		}
	}
	class bus extends vehicle{
		String fuel() {
			return "CNG";
		}
	}
	class car extends vehicle{
		String fuel() {
			return "Diesel";
		}
	}
	class bike extends vehicle{
		
	}
	


