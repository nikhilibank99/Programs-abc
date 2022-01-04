package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Sort {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(23);
		al.add(24);
		al.add(18);
		al.add(9);
//		al.add(9.76);//it will sort only unique data type otherwise it will throw class cast exception. cannot convert from data type to other
//		Collections.sort(al);// sorts in ascending order
//		Collections.sort(al, Collections.reverseOrder());// sorts in descending order
		Collections.shuffle(al);// it will shuffle the arraylist randomly
		for(Object r:al)
		{
			System.out.println(r);
		}
	}

}
