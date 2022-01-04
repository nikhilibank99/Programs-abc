package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collections_ArrayListExample {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();  
        al.add("Viru");    
        al.add("Saurav");    
        al.add("Mukesh");    
        al.add(1);    
		  
		Collections.sort(al,Collections.reverseOrder());
		
		  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		 }  
		}  

	

}
