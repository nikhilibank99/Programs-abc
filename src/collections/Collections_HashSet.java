package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Collections_HashSet {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("CHANDINI");
		hs.add('F');
		hs.add(5.72);
		hs.add(24);
		hs.add(24);// duplicate insertion is allowed but it will show only unique element as output.
		hs.add(null);// it will take null also and display same.
		hs.remove(24);//it will remove the object specified.
//		hs.removeAll(hs);// it will remove the entire hashset
		hs.add(null);
		
		
//	for (Object sr:hs)
//	{
//		System.out.println(sr);// it will give unordered output. insertion order is not preserved.
//	}
		
	Iterator it= hs.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

}
}
// 1) insertion order is not preserved.
// 2) duplicate elements are not allowed.
// 3) null value is accepted.
// 4) here only foreach loop and iterator interface can be used to retrieve objects.
// 5) remove methods are same across all sets. it will take only specified objects and not index.