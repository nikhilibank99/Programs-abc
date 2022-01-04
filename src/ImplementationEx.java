
public class ImplementationEx  implements InterfaceA,InterfaceB {
	static int c=13;
	
	public void run() {
		System.out.println("Run is overriden");
		
	}
 public static void test() {
	 int a=12;
	 System.out.println(a);
	
 }
	 static void main(String[] args) {
		
ImplementationEx a=new ImplementationEx();
a.run();
ImplementationEx.test();
System.out.println(ImplementationEx.c);


	}

}
