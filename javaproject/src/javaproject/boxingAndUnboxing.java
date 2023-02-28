package javaproject;

public class boxingAndUnboxing {
	public static void main(String args[]) {
		System.out.println("from main method");
		int i=40;  //primitive datatypes
		//wrapper types
		Integer i1=new Integer(30);    //corresponding object representation of primitive datatypes 		
		byte b=30;
		Byte b1=2;
		System.out.println(i);
		System.out.println(i1);
		System.out.println(b);
		System.out.println(b1);
		
		//Boxing and Unboxing
		
		//Boxing -automatic/ implicit conversion of primitive datatype to wrapper class
		
		Integer x=5;
		
		//Unboxing- explicit conversion of wrapper class to primitive datatypes
		
		Integer a1=new Integer(50);
		int z=a1;
		System.out.println(z);
	}

}
