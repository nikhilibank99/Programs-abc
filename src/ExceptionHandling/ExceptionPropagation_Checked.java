package ExceptionHandling;
//for checked exception propagation, it is mandatory to use throws keyword 
public class ExceptionPropagation_Checked {
	void play() throws InterruptedException {
		//System.out.println(20/0);
		Thread.sleep(1000);
	}
	void display() throws InterruptedException {
		play();
	}
void gg() throws InterruptedException {
//	try {
		display();
//	}
//	catch(Exception e)
//	{
		System.out.println("Exception handled");
//	}
}
public static void main(String[] args) throws InterruptedException {
	ExceptionPropagation_Checked u=new ExceptionPropagation_Checked();
	u.gg();
}
}
