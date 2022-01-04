package superkeyword;
//Program for checking Super keyword used for Method
public class SuperSample4 extends SuperSample3{
	void display() {
		System.out.println("Test Child class");
	}
	
	void show() {
		display();//calling child class method
		super.display();//calling parent class method
	}
public static void main(String[] args) {
	SuperSample4 s=new SuperSample4();
	s.show();//calling current class method
	
}
}
