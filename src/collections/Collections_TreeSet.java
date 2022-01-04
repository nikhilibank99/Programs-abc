package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Collections_TreeSet {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();// it will take only similar type of unique objects.
		ts.add(23);
		ts.add(100);
		ts.add(5);
		ts.add(24);
		ts.add(24);// duplicate insertion is allowed but it will show only unique element as output.
//		ts.add(null);// null is not allowed here.
		ts.remove(24);//it will remove the object specified.
//		ts.removeAll(ts);// it will remove the entire hashset
//		System.out.println(Collections.max(ts));
//		System.out.println(Collections.min(ts));
		
//	for (Object sr:ts)
//	{
//		System.out.println(sr);// insertion order is preserved.
//	}
		
	Iterator it= ts.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
		
	}

}}
//1) insertion order is not preserved.
//2) it will display elements in ascending order.
//3) it will give null pointer exception if we give null as value.
//4) it will take only similar type of unique objects means only either int datatype or double datatype values.
//5) here only for-each loop and iterator interface can be used to retrieve objects.
//6) remove methods are same across all sets. it will take only specified objects and not index.
//7) Collections.sort cannot be used in Set.