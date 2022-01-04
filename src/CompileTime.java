
public class CompileTime {

	
		public static void add(int a,int b) {
		System.out.println("sum is "+(a+b));
			
		}

public static double add(double a,double b) {
	System.out.println(a+b);
	return a+b;
	
	
		}


public static void main(String[] args) {
	//CompileTime.add(10, 20);
	CompileTime.add(10.25, 20.70);
}

}
