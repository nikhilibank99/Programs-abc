package collections;

import java.util.Map;
import java.util.TreeMap;

public class Collections_TreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,Character> hm1=new TreeMap <Integer,Character>();
		hm1.put(1, 'a');
		hm1.put(2, 'b');
		hm1.put(5, 'e');
		hm1.put(3, 'c');
		hm1.put(4, 'd');
		hm1.put(4, 'e');
//		hm1.put(null, null);//null pointer exception
	//	hm1.remove(2);
	//	hm1.replace(2, "gudu");
	//	System.out.println(hm1.get(1));
	//	System.out.println(hm1.containsKey(8));//for validation 
	//	System.out.println(hm1.containsValue(null));
	//	System.out.println(hm1.isEmpty());
//		for (Object h:hm1)
		for(Map.Entry ref:hm1.entrySet())
		{
			System.out.println(ref.getKey() + "\t\t" + ref.getValue());
		}

	}

}
// if we have same key & values twice , it will take only one entry of the key and value.
//but if Key is same and value is different then it will consider the latest key value pair.
// it does not take duplicate key but duplicate values are allowed.
// Treemap: null keys are not accepted but null values are accepted even more than one.
// when we are retrieving, the order type is ascending.
// remove method is used to remove only key and also key, value.
//key is always int type but value can be string,character
