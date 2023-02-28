package javaproject;

public class operators {
	public static void main(String args[]) {
		int a=10;
		int b=5;
		
		//arithmetic operators
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//unary operators
		
		System.out.println(a);
		System.out.println(a++); //increment happens after execution the value of a 
		System.out.println(a);
		System.out.println(++a);// increment happens before the execution of a 
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);
		
		//negate operator(unary)
		
		boolean isSelected =false;
		if(!isSelected) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		//relational operators <,>,<=,>=,==,!=
		//logical operators
		int age=16;
		boolean drivingClassesAttended=true;
		if(age>15 && drivingClassesAttended) {
			System.out.println("Liscense Issued");
		}
		else {
			System.out.println("come later");
		}
		// using or
		
		boolean isActive=false;
		int balance=5000;
		if(balance>1000 || isActive) {
			System.out.println("Transaction approved");
		}
		else {
			System.out.println("Transaction rejected");
		}
		//ternary operators
		
		String result=(age>18 && drivingClassesAttended)? "Liscence Isuued":"Liscence Rejected";
		System.out.println(result);
		
		int p=3;
		int q=9;
		int min=(p>q)?q:p;
		System.out.println(min);
		
		//assignment operator +=,-=,*=,/=
		
		q+=5;
		System.out.println(q);
	}

}
