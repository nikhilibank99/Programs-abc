package inheritance;

public class TestMainHierarchical {

	public static void main(String[] args) {
//		HierarchicalInteritance hi=new HierarchicalInteritance();//parent class object stored in parent reference
//		HierarchicalInteritanceChild1 hi=new HierarchicalInteritance();//parent class object cannot be stored in child class reference
		//HierarchicalInteritanceChild1 hic=new HierarchicalInteritanceChild1();
		//hic.add1();
//		HierarchicalInteritance hi1=new HierarchicalInteritanceChild1();// child class object stored in parent reference
		//hi1.add(); // going to parent class method
//		HierarchicalInteritanceChild1 hi2=new HierarchicalInteritanceChild1();
//		hi2.add();// child class reference accessing parent class method
//		hi2.add1();//child class reference accessing child class method (can access both child class and Parent class properties)
		HierarchicalInteritanceChild2 hi22=new HierarchicalInteritanceChild2();
		hi22.add();// child class2 accessing parent class method
		hi22.display(); // child class accessing its own method
//		hi22.add1();// no relationship b/w Hierarchical inheritance child1 & child2

	}

}
