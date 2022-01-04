package ExceptionHandling;

public class TryCatchBlock {

	
	public static void main(String[] args) {
		try {
			int a=10/0;
			System.out.println(a);
		}
	catch(ArithmeticException e) {
		//System.out.println("Exception handled");
		//e.printStackTrace();
		
		System.out.println("rubu");
		int c=20/0;
		System.out.println(c);
		System.out.println("handled");
		
	}	
	}
}
