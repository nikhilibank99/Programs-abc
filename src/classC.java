
public class classC extends classA{
	void meow(){
		System.out.println("meowing...");
		}
	
public static void main(String[] args) {
	classC c=new classC();
	classB b=new classB();
	b.bark();  
	c.eat(); 
    c.meow();
    b.eat();
}
}