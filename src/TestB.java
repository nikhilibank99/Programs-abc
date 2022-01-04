
public class TestB extends TestA{
	public int test(int a) {
		a=a+5;
		System.out.println(a);
		return a;
	}
public static void main(String[] args) {
	TestA a=new TestB();
	a.test(10);
	
	
}
}
