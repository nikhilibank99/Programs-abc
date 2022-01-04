package employee;

public class Programmer extends admin {
public Programmer(String name) {
		System.out.println("Hey " +name + " Thanks for contacting us");
		System.out.println();
	}
public void developer() {
	System.out.println("base salary is 35K for developer");
	System.out.println();
}
public void automationTester() {
	System.out.println("base salary is 30K for automation tester");
	System.out.println();
}
public static void main(String[] args) {
	Programmer pr=new Programmer("Nikhil");
	pr.basePay();
	pr.adminSalary();
	pr.developer();
	pr.automationTester();
}
}
