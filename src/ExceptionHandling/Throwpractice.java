package ExceptionHandling;
//any statement written after throw keyword will not be executed. we need to use finally block for same to be executed
//finally will work always with try and catch block
public class Throwpractice {
	void bookTicket() {
		System.out.println("book started");
		try {
			System.out.println(20/0);
		}
		catch(ArithmeticException e) {
			System.out.println("something went wrong");
			throw e;//it will throw the exception created above to its caller which is try block in the ThrowPractice_2 class
// throw is used to throw only one exception at a time.
			
		}
//		System.exit(0);// we cannot write any statement after catch and before finally block.
		finally {
		System.out.println("book ended");
	}}
	

}
