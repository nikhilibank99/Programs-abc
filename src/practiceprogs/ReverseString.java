package practiceprogs;

public class ReverseString {

	public static void main(String[] args) {
		String s="nikhil";
		char a[]=s.toCharArray();
		for (int i=s.length()-1;i>=0;i--) {
			System.out.print(a[i]+ " ");
		}

	}

}
