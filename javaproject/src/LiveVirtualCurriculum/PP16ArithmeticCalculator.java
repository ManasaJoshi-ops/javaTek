package LiveVirtualCurriculum;

import java.util.Scanner;

public class PP16ArithmeticCalculator {
public static void main(String[] args) {
	int choice = 0;
	int a,b;
	System.out.println("-----------");
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Remainder");
	System.out.println("-----------");
	System.out.println("Select your choice from the below menu");
	Scanner sc=new Scanner(System.in);
	choice=sc.nextInt();
	System.out.println("Enter any two numbers:");
	
	a=sc.nextInt();
	b=sc.nextInt();
	switch(choice) {
	case 1:float add=a+b;
	       System.out.println("The addition of "+a+" and "+b+" is "+add);
	       break;
	case 2:float difference=a-b;
          System.out.println("The difference of "+a+" and "+b+" is "+difference);
          break;
	case 3:float product=a*b;
          System.out.println("The product of "+a+" and "+b+" is "+product);
          break;
	case 4:float quotient=a/b;
          System.out.println("The quotient of "+a+" and "+b+" is "+quotient);
          break;
	case 5:float remainder=a%b;
          System.out.println("The remainder of "+a+" and "+b+" is "+remainder);
          break;      
	
	}
}
}
