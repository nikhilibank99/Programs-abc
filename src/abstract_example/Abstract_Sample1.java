// abstraction is used in listener class(Testng and webdriver)

package abstract_example;

//public final abstract class Abstract_Sample1 { abstract class cannot be declared as final
	public abstract class Abstract_Sample1 {
	// concrete class can have only concrete methods. 
	//but a abstract class can have both abstract methods and concrete methods.
		// abstract class can have a constructor and we can define the body part inside it.
	void display() {
		System.out.println("printing concrete method");
	}
	
//	abstract void showDisplay() { // we cannot declare body for an abstract method. 
//		System.out.println("time is passing");
//	}
//	static abstract void display1();// we cannot declare abstract method as static/final/private
	abstract void display1();// if we declare method as abstract then mandatorily we have the declare the class as abstract.
	abstract int display2();// we can use public or protected access specifier with abstract method
//	public static void main(String[] args) {
//	Abstract_Sample1 a =new Abstract_Sample1();// we cannot create or instantiate a object for an abstract class
//  }
	
	// abstract class can have main method.

}
