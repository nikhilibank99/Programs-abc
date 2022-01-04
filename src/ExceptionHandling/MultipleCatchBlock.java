package ExceptionHandling;
//at a time only one exception occurs in a try block and corresponding catch block will be executed.
public class MultipleCatchBlock {
	public static void main(String[] args) {
		try {
			int a=10/0;
			System.out.println(a);
			int  arr[]=new int [5];
		System.out.println(arr[10]);	
		String s=null;
		System.out.println(s.length());
		
		}
	catch(ArithmeticException e) {
		//System.out.println("Exception handled");
		//e.printStackTrace();
		
		System.out.println("rubu");
//		int c=20/0;
//		System.out.println(c);
//		System.out.println("handled");
		
	}	
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayException Handled");
		}
	
		catch(NullPointerException e)
		{
			System.out.println("NullPointer Exception Handled");
		}
	}

}
