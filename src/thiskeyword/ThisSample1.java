package thiskeyword;
//example for variable using this keyword.
/*This is a keyword which is used to point for the current class member.
 * with this keyword it always consider the variable used as global variable. 
 * local variable scope is always local.
 * global variable can be used anywhere.
 * this keyword is optional to be used when we call/invoke methods.
 * this keyword is required to distinguish the constructor to be called.
 */
 
public class ThisSample1 {
int id=2;
String name="gudu";

public ThisSample1( int id, String name) {
	this.id=id;//1
	this.name=name;//nikhil
	
}
//void display() {
//	System.out.println("id is "+id +"name is "+name);
//}
public static void main(String[] args) {
	ThisSample1 t=new ThisSample1(1,"nikhil");
	System.out.println("id is " +t.id);
	System.out.println("name is " +t.name);
}

}
