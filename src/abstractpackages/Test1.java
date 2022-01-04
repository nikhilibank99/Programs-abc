package abstractpackages;

public class Test1 extends AbstractExample {
	
public void test2() {
	System.out.println("This is test2");
}


void demo() {
	
	System.out.println("This is body");
	
	
}

public void method() {
	System.out.println("This is overriden");
}

public static void main(String[]args) {
	AbstractExample a=new Test1();
	a.demo();
	a.test2();
	//a.test3();
    //a.test4();
	a.method();
}
}
