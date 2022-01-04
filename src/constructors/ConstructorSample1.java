/* constructor is a block of code similar to methods. 
 * it is special type of methods which is used to initialize object.
 * everytime an object is created using 'new' keyword atleast one constructor is called.
 * Java compliler provides a default constructor if there is no constructor.
 * at the time of calling constructor memory for object is allocated.
 * constructor name should be same as class name with no return type.
 * constructor cannot be abstract,static,final.//illegal modifier . 
 * only public, protected & private are permitted for the constructor
 * constructor can have a empty return statement
 * Constructors cannot be inherited so it can also not be overriden
 * */

package constructors;

public class ConstructorSample1 {

	protected ConstructorSample1(int a,int b) {
		int c=a+b;
		System.out.println(c);
		//return; empty return statement
		
	}
	public static void main(String[] args) {
	ConstructorSample1 a=new ConstructorSample1(2, 3);//parameterized constructor. value is passed while creating object.
		
	}
}
