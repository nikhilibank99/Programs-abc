package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Collection_AddAllelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(23);
		al.add(24);
		al.add(9.76f);
		al.add(true);
		al.add('f');//this command is to add elements to arraylist
		al.add("kavya");
		ArrayList al2=new ArrayList();
		al2.add(24);
		al2.add(25);
		al2.add('e');
//		al.addAll(al2);//here al2 entries will get added to al and get stored in al arraylist.(just like union)
//		al.removeAll(al2);
//		al.retainAll(al2);//intersection
//		System.out.println(al.isEmpty());//return type is boolean to verify if the arraylist is empty or not.
//		System.out.println(al.contains(24));//here we are checking if the element is present in the arraylist and return type is boolean
		ListIterator itr=al.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
