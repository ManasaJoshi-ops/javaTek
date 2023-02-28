package javaproject;

import com.mywebsite.functions.switchFunction;

public class loops {
	public static void main(String args[]) {
//		for(int i=0;i<3;i++) {
//			System.out.println("Hello World");
//		}
//		
//		for (int i=0;i<=10;i++) {
//			if (i%2==0) {
//				System.out.println(i);
//			}
//		}
//		
		//or else
//		
//		for (int i=0;i<=10;i+=2) {
//			System.out.println(i);
//		}
//		
		// sum of odd numbers from 1 to 10
//		int sum=0;
//		for(int k=1;k<=10;k+=2) {
//			sum=sum+k;
//		}
//		System.out.print(sum);
		
		//print numbers from 10 to1
//		for(int i=11;i>=0;i--) {
//			System.out.println(i);
//		}
		
		//break and continue
		
//		for(int i=1;i<=10;i++) {
//			if (i>5) {
//				break;
//			}
//			System.out.println(i);
//		}
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//			if(i>5) {
//				continue;
//			}
//			
//		}
		
		//while loop
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		switchFunction ob=new switchFunction();
	}

}
