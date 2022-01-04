
public class OverloadingEx {
	
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
	void add(int a,int b,int c) {
		int x=a+b+c;
		System.out.println(x);
		
	}
	double add(float a,float b) {
		double c=a+b;
		System.out.println(c);
		return c;
		
		
	}
	

	public static void main(String[] args) {
	
		OverloadingEx e=new OverloadingEx();
		e.add(10, 20);
		e.add(10, 20, 30);
		e.add(10.0f, 20.0f);
	}

}
