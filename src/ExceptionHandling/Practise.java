package ExceptionHandling;

public class Practise {
public static void main(String[] args) {
	try {
		int a=10;
		int b=0;
		int x=a/b;
		System.out.println(x);
	}
catch(ArithmeticException e) {
	System.out.println("print");
	
}
//finally {
//	System.out.println("Finally block executed");
//}


}
}
