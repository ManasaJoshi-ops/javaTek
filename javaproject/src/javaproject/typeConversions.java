package javaproject;

public class typeConversions {
	public static void main(String args[]) {
		//type casting
		
		int a=100;
		byte b=30;
		//explicit type casting
		b=(byte) a;
		System.out.println(b);
		//implicit type casting
		a=b;
		System.out.println(a);
		
		// typecasting for characters
		//*******Implicit type asting **********
		
		//char is 2 bytes
		char ch='c';
		System.out.println(ch);
		//int is 4 bytes
		int y=ch;
		System.out.println(y);
		
		//*******Explicit typecasting*************
		
		int integer=99;
		char character=(char) integer;
		System.out.println(character);
	}

}
