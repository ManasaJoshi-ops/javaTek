package polymorphism;

public class RunTimepolymorphism {
	public static void main(String args[]) {
		MacBook mb=new MacBookPro();
		mb.start();
		mb.shutDown();
		
	}
}
class MacBook{
	void start() {
		System.out.println("MacBook started..");
	}
	void shutDown() {
		System.out.println("MacBook shutdown..");
	}
}
class MacBookAir extends MacBook {
	void start() {
		System.out.println("MacBookAir started..");
	}
	void shutDown() {
		System.out.println("MacBookAir shutdown..");
	}
}
class MacBookPro extends MacBook{
	void start() {
		System.out.println("MacBookPro started..");
	}
	void shutDown() {
		System.out.println("MacBookPro shutdown..");
	}
}
