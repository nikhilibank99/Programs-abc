package ExceptionHandling;

public class FinallyBlock {
	public static void main(String[] args) {
		
		try {
			int a=10/0;
			System.out.println(a);
			
		
		
		}
	catch(ArithmeticException e) {
	System.out.println("handled");

		}
		
		
		finally {
			System.exit(0);
			System.out.println("rubu");
		}
		
	}

}
