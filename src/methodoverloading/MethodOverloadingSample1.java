/*a class having methods of same name with different type of parameters(data types) and number of parameters*/

package methodoverloading;

public class MethodOverloadingSample1 {

	int add(int a)
	{
		System.out.println("displaying a is " +a);
		return a;
	}
	
	
	String add(int a, String b)
	{
		System.out.println("displaying a+b is " +(a+b));
		return a+b;
	}
	String add(String a, int b)
	{
		System.out.println("displaying a+b is " +(a+b));
		return a+b;
	}
//	double add(double a, double b) {
//		System.out.println("displaying a+b is " +(a+b));
//		return a+b;
//	}
	int add(double a, double b) {
		System.out.println("displaying a+b is " + (int)(a+b));
		return (int)(a+b);
		} //here we need to type cast to int type as parameters are in double and return type is int.
/*	double add(int a, int b) {
		System.out.println("displaying a+b is " +(a+b));
		return a+b;
} changing return type only(here double) is not applicable for overloading. we need to change the parameters data type also.
*/
	public static void main(String[] args) {
		MethodOverloadingSample1 m=new MethodOverloadingSample1();
		m.add(3);
		m.add(3, "nikhil");
		m.add("Gudu", 3);
		m.add(3.0, 4.2);
}
}