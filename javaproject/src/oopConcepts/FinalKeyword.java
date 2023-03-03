package oopConcepts;

public class FinalKeyword {
	public static void main(String args[]) {
		Done obj=new Done();
		obj.doWork();
	}
}
class Work {
	void doWork(){
		System.out.println("Do some work");
	}
}
class Done extends Work() {
	void doWork() {
		System.out.println("Work done");
	}
}

	
