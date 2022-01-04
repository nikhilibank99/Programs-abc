package ExceptionHandling;
//throws can be used to throw multiple exceptions
public class ClassnotfoundException {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main started");
		
		Class.forName("java.lang.String");
		System.out.println("Main Ended");
	}

}
