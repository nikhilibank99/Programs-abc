package ExceptionHandling;

public class Exceptionpropagation_unchecked {

	void play() {
		System.out.println(20/0);
	}
	
void display() {
	play();
}
void gg() {
try {
	display();
}
catch(Exception e)
{
	System.out.println("Exception handled");
}
}
public static void main(String[] args) {
	Exceptionpropagation_unchecked u=new Exceptionpropagation_unchecked();
	u.gg();
}
}

