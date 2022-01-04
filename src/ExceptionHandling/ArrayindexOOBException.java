package ExceptionHandling;

public class ArrayindexOOBException {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println("Main started");
		try {
			System.out.println(a[5]);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Main Ended");
		}

	}

}
