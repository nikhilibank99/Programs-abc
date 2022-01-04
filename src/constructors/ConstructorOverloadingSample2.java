/* no return type in constructor*/
// this is constructor overloading with different type and number of arguments

package constructors;

public class ConstructorOverloadingSample2 {
	public ConstructorOverloadingSample2(int a,int b) {
		int c=a+b;
		System.out.println("test comments "+c);
	}
	
	public ConstructorOverloadingSample2(int d,int e,int f) {
		int g=d+e+f;
		System.out.println("test comments "+g);
	}
	
	public ConstructorOverloadingSample2(double a,double b) {
		double c=a+b;
		System.out.println("test comments "+c);
	}
	
	public static void main(String[] args) {
		ConstructorOverloadingSample2 d1=new ConstructorOverloadingSample2(10, 20);
		ConstructorOverloadingSample2 d2=new ConstructorOverloadingSample2(3, 4, 5);
		ConstructorOverloadingSample2 d3=new ConstructorOverloadingSample2(3.2, 4.6);
		
	}

}
