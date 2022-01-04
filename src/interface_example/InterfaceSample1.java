/* it is used to achieve 100% abstraction.
 * Interface is bidefault abstract.
 * All the methods declared inside interface are bidefault public , abstract
 * all the variables declared inside interface are bidefault public, final, static.
 * we can declare the concrete methods in interface as private, default and static also.
 * there can be is-a relationship between two interfaces. 
 * a class can implements an interface but a interface will extends another interface
 * we cannot create object for a interface.
 * an interface can have public,private,default,static,abstract
 * it should not have a final method
 * Interfaces cannot have constructors
 * */
package interface_example;

public interface InterfaceSample1 {
//	public InterfaceSample1() {
//		
//	}
public abstract void display();
void test1();
public static final int a=10;
private void d() {
	System.out.println("time");
}
static void d1() {
	System.out.println("nikhil");
}
}
