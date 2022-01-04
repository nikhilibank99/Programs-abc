package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections_Linkedlist {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
//		Vector li=new Vector();
		li.add(1);
		li.add(10);
		li.add(111);
		li.add(1211);
//		li.remove(2);
		li.add(1);
//		li.add(null);// it takes more than one null and display same.
//		li.add(null);
//		li.add(null);
//		li.addFirst(5);// to add element to first index
//		li.addLast(89);//to add element to last index
//		li.removeFirstOccurrence(1);
//		li.removeLastOccurrence(1);
//		li.clear();
//		li.removeFirst();// to remove first element from list.
//		li.remove();// will remove first index value.
//		li.removeLast();// to remove last element from list.
//			System.out.println(li.getFirst());//to retrieve only first element
//			System.out.println(li.getLast());//to retrieve only last element
		Collections.sort(li);
		System.out.println(li);
//		}
//		for(Object r:li)
//		{
//			System.out.println(r);
//			
//		}
//		Iterator it=li.Iterator();
//		Iterator it=li.descendingIterator();// returns elements in reverse insertion order
//		while(it.hasNext())
//		{
//			
//			System.out.println(it.next());
//		}
//		ListIterator lit=li.listIterator();
//		System.out.println("forward ---->");
//		while(lit.hasNext())
//		{
//			System.out.println(lit.next());
//		}
//		System.out.println("<---- backward");
//		while(lit.hasPrevious())
//		{
//			System.out.println(lit.previous());
//		}
	}

}

//remove() without index will work only in linkedlist. with index will work in arraylist and vector.