package encapsulationexample;

public class EncapsulationSample2{
	void display() {
		System.out.println("test");
	}
public static void main(String[] args) {
	
	EncapsulationSample1 e=new EncapsulationSample1();
	e.activateSimcard();
	e.deactivateSimcard();
	System.out.println(e.getStatus());
}
}

