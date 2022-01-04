package finalSample;

public abstract class FinalExample4_Method {
	final static int a;//*here we are not initializing final variable which is static
//	FinalExample4_Method(){// in constructor we can initialize a final variable.
//		a=9;
//	}
	static {
		a=90;//*static variable can be initialized in a static block or static method only
	}
	final static void display() {// final methods can be declared as static
		
	}
//final abstract void m1();// abstract methods should not be declared as final as abstract methods needs to be overriden. 

}
