package exceptiondemo;

import java.util.Scanner;

public class FinallyKeyword {
public static void main(String[] args) {
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
	}finally {
		System.out.println("Calculator terminated");
	}
}
}
