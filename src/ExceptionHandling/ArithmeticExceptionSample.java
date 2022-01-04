// only for integer type, if we are dividing the values we get arithmetic exception for other data types we get infinity as o/p
// Exception is an event trigered by JVM when some abnormal operations are performed.
//Exceptions are handled by using try and catch block

package ExceptionHandling;

public class ArithmeticExceptionSample {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try{
			
			int c=a/b;//arithmetic exception
			System.out.println(c);
			
		
		
	}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("nikhil");
			System.exit(0);
			
			
}
		
		finally {
			
			System.out.println("Anil");
			System.out.println("adasd");
		}
		}
	}
