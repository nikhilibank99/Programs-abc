package finalSample;
/* final class cannot be inherited.
 * */
//public class Final_Sample2_Class extends Final_Sample1_Class{
	public class Final_Sample2_Class{
	public static void main(String[] args) {
		
//Final_Sample1_Class f=new Final_Sample2_Class();//parent class declared as final cannot provide reference to child class for creating object.
		 Final_Sample1_Class f1=new Final_Sample1_Class();//we can create objects of final class
//		 f.display();
	}
}
