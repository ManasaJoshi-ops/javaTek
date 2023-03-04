package exceptiondemo;

public class Multicatch {
public static void main(String[] args) {
	
	try {
		String s1=null;
		System.out.println("The length of the string is"+s1.length());
		String s2="hello";
		System.out.println("---------");
		int i=Integer.parseInt(s2);
		System.out.println("Converted int:"+i);
		System.out.println("----------");
	}catch(NullPointerException npex) {
		System.out.println("Null pointer exception occured.."+npex.getMessage());
	}catch(NumberFormatException nfex) {
		System.out.println("Number format exception has occured.."+nfex.getMessage());
	}
}
}
