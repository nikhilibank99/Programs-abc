/*1. it is a readymade utility which contains classes and interfaces 
 2. all the classes and interfaces related to collection framework are present in java.util package
 3. we have 2 major interfaces in collection framework a) map b) collection 
 4. collection framework can consume only non primitive types*/

package collections;

import java.util.ArrayList;

public class Collection1_Arraylist {
public static void main(String[] args) {
	ArrayList<Integer> al =new ArrayList();
	al.add(10);
	al.add(9);
	al.add(2);
	al.add(8);
	al.add(null);
	al.add(9);//duplicate elements also allowed here
	al.remove(1);
	for(int i=0;i<al.size();i++)
	{
		Object r=al.get(i);//get() is used to retrieve elements from array list
		System.out.println(r);
	//	break;
	}
//	for(Object i:al)
//	{
//		System.out.println(i);
//	}
}
}
