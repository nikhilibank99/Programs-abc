package superkeyword;

public class SuperSample6 extends SuperSample5 {
	public SuperSample6() {
	//	super();// Super constructor is implicitly called by compliler even if we don't write super.
		System.out.println("Child class Constructor");
	}
	
	public static void main(String[] args) {
		SuperSample6 s=new SuperSample6();
		
	}
}
