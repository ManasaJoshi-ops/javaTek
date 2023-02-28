package javaproject;

public class staticblocks {
	public static void main(String args[]) {
		System.out.println("from main method");		
	}
	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}

}
