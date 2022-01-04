package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Iterator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(24);
		al.add(9.76);
		al.add('f');
		al.add("kavya");
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Object r=it.next();
			System.out.println(r);
		}


	}

}
