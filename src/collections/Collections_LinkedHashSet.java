package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collections_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("CHANDINI");
		hs.add('F');
		hs.add(5.72);
		hs.add(24);
		hs.add(24);// duplicate insertion is allowed but it will show only unique element as output.
		hs.add(null);// it will take null also and display same but only one time.
		hs.remove(24);//it will remove the object specified.
//		hs.removeAll(hs);// it will remove the entire hashset
		hs.add(null);
		
		
		
//	for (Object sr:hs)
//	{
//		System.out.println(sr);// insertion order is preserved.
//	}
		
	Iterator it= hs.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	

}}

// 1) insertion order is preserved.
// 2) duplicate elements are not allowed.
// 3) null value is accepted but displayed only once.
// 4) here only for-each loop and iterator interface can be used to retrieve objects.
// 5) remove methods are same across all sets. it will take only specified objects and not index.