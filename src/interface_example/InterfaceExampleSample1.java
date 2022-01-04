package interface_example;

public class InterfaceExampleSample1 implements InterfaceSample1{
	public void display() {
		System.out.println("test");
	}
	
	 static void d1() {
		System.out.println("Preet");
	}
	public void test1() {// when we are trying to override the abstract method we need to declare the method as public in the implementable class.
		 System.out.println("testing QA");
	 }
	
	public static void main(String[] args) {
		InterfaceExampleSample1.d1();
		InterfaceExampleSample1 i=new InterfaceExampleSample1();
		i.d1();
	//	InterfaceSample1 as=new InterfaceSample1();we cannot create object for a interface.
		InterfaceSample1 is=new InterfaceExampleSample1();//interface reference can be given to implementable class
		is.display();
		is.test1();
	}

}
