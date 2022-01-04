// compiler bidefault creates default constructor while creating object.
// hence we came to know default values for int,float and string type

package constructors;

public class GE {
int empid; 
String name;  
float salary;
//method to display the value of id and name  
void display(){
	System.out.println(empid+" "+name + " " +salary);
	}  
  
public static void main(String args[]){  
//creating objects  
	GE s1=new GE(); //compiler called default constructor  
	GE s2=new GE();  //compiler called default constructor
//displaying values of the object  
s1.display();  
s2.display();  
}  
}  