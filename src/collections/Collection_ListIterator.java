package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Collection_ListIterator {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(23);
		al.add(24);
		al.add(9.76f);
		al.add(true);
		al.add('f');//this command is to add elements to arraylist
		al.add("kavya");
		al.add(23);
//		al.set(2, 'B');// this command is to replace existing arraylist element with new by giving index and value.
//		al.add(2, 7.9);//we have to enter value using this method in contiguous memory position. 
		//arraylist growable in behaviour.
//		al.remove(1);// it will remove the element from the given index of arraylist and next index will come in place of the deleted index.
//		al.remove((Character)'f');
//		al.remove((Integer)24);
//		we have to typecast for char type, integer type but not for double/float type.
//		al.remove(9.76f);
//		al.removeAll(al);//remove all elements from the arraylist.
		boolean b=al.remove((Integer)23);//remove if the object is present and returns true else false. 
		//but in-order to retrieve the boolean type we need to store in a boolean type reference variable.
		System.out.println(b);
		ListIterator lit=al.listIterator();
		System.out.println("forward ---->");
		while(lit.hasNext())
		{
			Object r=lit.next();
			System.out.println(r);
		}
//		System.out.println("<----backward");
//		while(lit.hasPrevious())
//		{
//			Object r=lit.previous();
//			System.out.println(r);
//		}

	}


	}

// al.add(element)
//al.remove(index)
//al.removeAll(collection c) -> remove all elements from the arraylist.
