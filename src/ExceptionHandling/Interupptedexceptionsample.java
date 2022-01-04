package ExceptionHandling;
//Thread.sleep throws checked exception. in-order to handle, use try catch block or throws keyword
public class Interupptedexceptionsample {

	public static void main(String[] args) {
		System.out.println("Main Started");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main ended");
	}

}
