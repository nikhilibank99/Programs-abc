
public class ExceptionExamples {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b=10;
		int c=0;
		
		try {
			
			
	//	int d=b/c;
		 System.out.println("dones!");
		//System.out.println( a[10]);
		
		
		//System.out.println(c);
		
		}
		
		
			catch(ArithmeticException e) {
				int d=b/c;
   System.out.println("done!");
		//System.out.println(e);
		
	}
//	catch(ArrayIndexOutOfBoundsException e) {
//		
//		System.out.println(e);
//	}
//		
	
	
//}
		catch(Exception e) {
		       
		      
			System.out.println(e);
			
		}
	
		finally {
			System.out.println("nikhil");
		}
		
		
		
	}

}
