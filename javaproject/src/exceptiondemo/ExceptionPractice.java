package exceptiondemo;

import java.util.Scanner;

public class ExceptionPractice {
	public static void main(String[] args) {
		dividedByZero();
		nullPointer();
		stringParserDemo();
	}
	
    private static void nullPointer() {
    	try {
    		String s1=null;
    		System.out.println(s1.length());
    	}catch(NullPointerException e) {
    		System.out.println("Enter the valid String .. "+e.getMessage());
    		System.out.println("Excption handled");
    		System.out.println("----------");
    	}
    }
    private static void stringParserDemo(){
    	try {
    		String s="hello";
    		int i=Integer.parseInt(s);
    	}catch(Exception e) {
    		System.out.println("This string cannot be converted to integer"+e.getMessage());
    		System.out.println("----------");
    	}
    }
	private static void dividedByZero() {
		int a, b;
		float c,d;
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("the two numbers entered are:"+a+" and "+b);
		try {
			c=a/b;
			d=a%b;
			System.out.println(a+"/"+b+"="+c+" Reaminder="+d);
		}catch(ArithmeticException e) {
			System.out.println("An Exception occured"+e.getMessage());
			System.out.println("----------");
		}
	}

}
