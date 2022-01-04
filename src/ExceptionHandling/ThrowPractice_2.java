package ExceptionHandling;

public class ThrowPractice_2 {

	public static void main(String[] args) {
		Throwpractice ir=new Throwpractice();
		System.out.println("Main Started");
     try {
    	 ir.bookTicket();//1- first it will call the method bookticket in Throwpractice class. 
    	 //2- then it will get the exception thrown from "throw e" keyword of Throwpractice class
     }
     catch(ArithmeticException e) {
    	 System.out.println("sorry server is down");
     }
         
    	 System.out.println("Main Ended");
	}

}
