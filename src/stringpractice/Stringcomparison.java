package stringpractice;
/* we have 3 methods for comparing 2 or more strings. a) equals() b) compareTo() , c) == 
a) equals() : verify the content of 2 or more strings.
b) equalsIgnoreCase() : it will verify the content are matching or not without considering the case.
c) compareTo()  : always it will compare the first character of both the strings. if s1<s2 then it will be -ve else +ve
if we are comparing small case with upper case then we will consider only the ASCII value of the letter.
d) compareToIgnoreCase(): this will ignore the case of 1st letters of the string and compare them. if s1<s2 then it will be -ve else +ve.
ASCII value of a - z : 97 to 122 
ASCII value of A - Z : 65 to 90
e) ==  : checking the object reference are same or not;
*
*/
public class Stringcomparison {

	public static void main(String[] args) {
//		String s="Pretti";
//		String s1="pretti";
	//*** equals() and ==
//		System.out.println(s1.equals(s)); // false
//		System.out.println(s1.equalsIgnoreCase(s)); // true
//		String g="Nikhil";//n=110
//		String h="preetish";
//		String i="nikhil  Singh";//N= 78
//		String i1="preetish";
//		i1=i.concat(i1);
//		System.out.println(i1);
		//****compareTo() : return type is integer. if matching then 0, if not matching then +ve or -ve . 
		//if there is small n and capital N then it will compare the ASCII values.
//		String j="Jatin";
//		String k="jatin";
	//	System.out.println(g.compareTo(i));
	//	System.out.println(g.compareTo(h));
	//	System.out.println(j==k);//false as it is considered as 2 different objects.
		
		// ****toUpperCase() and toLowerCase()
//		System.out.println(i.toUpperCase());
//		System.out.println(g.toLowerCase());
// toCharArray: return type is character type array.
		//	char a[]=g.toCharArray();//it will extract the characters of the string and store in the Array.
//		for (int p=0;p<=a.length-1;p++) {
//			System.out.println(a[p]);
//		}
//  charAt();//it will extract the character at the particular index mentioned. return type is character.
//		System.out.println(g.charAt(1));
		//***trim(): it will remove the white space at the beginning of the string.
//		System.out.println(i1.trim());//it will remove the white space at the beginning of the string. 
		//*** split
//		String a[]=i.split("\\s");// it will extract the string and store in in string array. nikhil @ location 0 , 
		//space @  index 1 , singh @ index 2
//		System.out.println(a[2]);
//		for(String jh:a) {
//			System.out.println(jh);
//		}
		
//		contains(): it will search for matching pattern in the string. return type is boolean
//		String s="my name is Nikhil";
//		System.out.println(s.contains("Name"));
//		String s=null;
//		System.out.println(s.contains("hi"));// null pointer exception
		
//   	endsWith(): it shall check the ending character or sequence of character. return type is boolean
//		String a="when there is a will there is a way";
//		System.out.println(a.endsWith("will"));	
		
//      replace():  it shall replace all occurences of either a single character or character sequence i.e string
//		String a="when there is a will there is a way";
//		System.out.println(a.replace('e', 'a'));//single character replace
//		System.out.println(a.replace("when there", "then fire"));//sequence of characters replace
		
//		replaceAll(): //it will also replace all occurences of the substring with another string but with help of regular expression
//		String a="when there is a will there is a way. united is stand is we fall";
//		System.out.println(a.replace("is", "was"));
// *** isEmpty() and isBlank: returns boolean value false if found its length is 0	else true.	
//		String a="My name is Nikhil";
//		String b="";
//		System.out.println(a.isBlank());
//     *** join(): append delimeter(ex #,/) with character sequence
//		String a=String.join("#", "My","name" , "is", "Nikhil");//My#name#is#Nikhil
//		System.out.println(a);
//		String b=String.join("/", "13","7","2021");
//		System.out.println(b);//13/7/2021
//    ****substring(): 	it is a part of string	
//		String a="My#name is Nikhil";
//		System.out.println(a.substring(0,3));// here 0 is inclusive and 3 is exclusive so o/p is My# .
//		System.out.println(a.substring(1));// o/p is y#name is Nikhil
		
		
}}
