
 final class FinalExample {
	 
 
	
	final static int demo(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	final static double demo1(int a,int b) {
		double c=a+b;
		System.out.println(c);
		return c;
	}
	
	final void print() {
		System.out.println("print me");
	}
	
	public static void main(String[] args) {
//		FinalExample f=new FinalExample();
//		f.demo(5, 7);
//		f.demo(11.2, 13.5);
		FinalExample.demo(2, 3);
		FinalExample.demo(10, 20);
		//FinalExample.demo(2.0, 3.4);
		
}}


