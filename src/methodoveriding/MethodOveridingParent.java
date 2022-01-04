package methodoveriding;

public class MethodOveridingParent {

	int r=25;
	static void run() {// static methods cannot be overriden
		System.out.println("Bike will run");
	}
	void walk() {
		System.out.println("Men will walk");
	}
}
