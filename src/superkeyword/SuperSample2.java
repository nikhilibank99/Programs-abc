package superkeyword;
//Program for checking Super keyword used for Variable
public class SuperSample2 extends SuperSample1{
	String color="white";
	void display() {
		System.out.println(color);//calling current class variable
		System.out.println(super.color);// calling parent class variable
	}
public static void main(String[] args) {
	SuperSample2 s=new SuperSample2();
	s.display();
}
}
