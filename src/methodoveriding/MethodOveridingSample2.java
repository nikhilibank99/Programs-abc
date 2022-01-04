package methodoveriding;
//in method overiding, the signature of the method should remain same.signature: int display(int a,int b)
public class MethodOveridingSample2 extends MethodOveridingSample1{

	//protected void display(double a,double b)// it will take 1st class method as signature is different
	protected void display(int c,int d)// it will take 2nd class method as signature is same
	// protected void display() 
	{/*if public and protected access specifiers are given in parent class then only
		it is allowed for overriding the method in child class using inheritance
		default access specifier is restricted with protected access specifier. they both cannot be used together*/
		System.out.println("Method display2 " +c +" " +d);
	}
	
	public static void main(String[] args) {
		MethodOveridingSample1 mos2=new MethodOveridingSample2();
		mos2.display(1,1);
	}
	/* if we are giving same signature in both child class and parent class method then overriding is done else not done. 
	 * meaning void display() or void display(int a,int b) should be same in both class methods. 
	 * if it changes then overriding will not be done.*/
}
/* public parent class= public child class
 * protected Parent class= public/protected child class
 * widening is possible for Method overriding but not narrowing
 * if parent class method is public and child class is protected then it comes narrowing which is not applicable for overriding
 * Public > protected > Default > Private (Widening)
 */
 