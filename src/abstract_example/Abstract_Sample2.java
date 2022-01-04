package abstract_example;
//though there is no implementation in abstract methods, so we need to override and define the body in child class.
public class Abstract_Sample2 extends Abstract_Sample1 {
	void display1() {
		int a=10;
		System.out.println("value of abstract method 1 display1 is " +a);
	}
	int display2() {
		int b=20;
		System.out.println("value of abstract method 2 display2 is "+b);
		return b;
	}

public static void main(String[] args) {
	Abstract_Sample1 as=new Abstract_Sample2();
	as.display();
	as.display1();
	as.display2();

}
}
