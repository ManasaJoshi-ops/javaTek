package polymorphism;

public class CompileTimePolymorphism {
	public static void main(String args[]) {
		CompileTime ctp=new CompileTime();
		ctp.add(6, 2);
		ctp.add(2.44f, 6.99f);
		ctp.add(2,3,4);
	}
}
class CompileTime{
	void add(int a, int b) {
		int result=a+b;
		System.out.println(result);
	}
	void add(float a, float b) {
		float result=a+b;
		System.out.println(result);
	}
	void add(int a, int b, int c) {
		int result=a+b+c;
		System.out.println(result);
	}
}
