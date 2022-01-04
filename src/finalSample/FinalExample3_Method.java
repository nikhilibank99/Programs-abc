package finalSample;
//Final methods can be inherited but cannot be overriden
public class FinalExample3_Method extends FinalExample2_Method{
//	void display() {
//		System.out.println("modified class methods");
//	}
public static void main(String[] args) {
	FinalExample2_Method f=new FinalExample3_Method();
	f.display();// calling parent class method here.
}
}
