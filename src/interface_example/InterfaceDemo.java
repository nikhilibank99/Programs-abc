package interface_example;

public class InterfaceDemo implements PrintDemo{

	public static void main(String[] args) {
		
		PrintDemo.hello();// calling static method of interface
		  
		hello();// calling static method of implementation class
	}
	 static void hello()
	    {
	        System.out.println("Called from Class");
	    }
}
