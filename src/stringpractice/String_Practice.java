package stringpractice;

//here s1="nikhil". but when we do s1.concat("Singh"), it does not append/modify s1 reference. so string objects are immutable.
// but if we give a reference variable i.e s1=s1.concat("Singh"), it will create a new object and store the modified value
// and assign it to s1 reference. so now if we print s1 it will point to a new object and not the old object(gets garbaged.)
public class String_Practice {
//without creating string object also we can access the string inbuilt methods through this literals
	public static void main(String[] args) {
		String s1="Nikhil";//String Literals 
	//	s1="Nikhil Singhs";
////		String s2=new String("nikhil");
//		String s3="Nikhil";
////		System.out.println(s3);
////		System.out.println("Nikhil".charAt(2));
//		System.out.println(s1==s3);
//		System.out.println(s1.concat(" Singh"));
//		System.out.println(s1==s3);
//		s1=s1.concat(" Singh");
//		System.out.println(s1);
//		System.out.println(s1==s3);
		s1="Nikhilrubu";//
		String s3="Nikhil";
		s1=s1.concat(s3);
		System.out.println(s1);
		
		
	}

}
