package inheritance;

public class ChildClassSingle extends InheritancePracSingle{
	void display1(){
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		//ChildClass cc=new ChildClass();
		//InheritancePrac cc=new InheritancePrac();
		InheritancePracSingle cc=new ChildClassSingle();
		//cc.display1(); // display1 is child class method . to access same we need to give child class reference.
		//if we give parent class reference we will get compile time error
		cc.display();
	}

}
