package ExceptionHandling;

public class NullpointerExceptionSample {
	public static void main(String[] args) {
		
	
	String s=null;
	try {
		s.length();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("Don't deal with null");
	}
	
	

}
}