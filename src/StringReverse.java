
public class StringReverse {

	public static void main(String[] args) {
//		Reverse a string
		String s="Nikhil Singh";
//		System.out.println(s.replaceAll("\\s", ""));
		char[]a=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
		if(s.equals(" "))
				{
			s.replaceAll("\\s", "");
			System.out.print(a[i]);
				}
		
		
		}
		//Fibonasci series
//		int n1=0,n2=1,n3,count=10;
//		System.out.print(n1 +" ");
//		System.out.print(n2+" ");
//		for (int i=2;i<=count;i++)
//		{
//		n3=n1+n2;//1 2
//		System.out.print(" "+n3);
//		n1=n2;
//		n2=n3;
		
//      length of array
//		char[]a= {1,2,3};
//		int b=a.length;
//		System.out.println(b);
//		}

	}

}
