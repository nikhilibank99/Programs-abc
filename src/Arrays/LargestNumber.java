package Arrays;

public class LargestNumber {

	public static void main(String[] args) {

		int a[]= {2,21,70};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>a[i+1]&& a[i] > a[i+2])
			{
				System.out.println("Number is largest " + a[i]);
				break;
			}
			else if(a[i+1]> a[i] && a[i+1]>a[i+2])
			{
				System.out.println("Number is largest " + a[i+1]);
				break;
			}
			else if(a[i+2]> a[i] && a[i+2]>a[i+1])
			{
				System.out.println("Number is largest " + a[i+2]);
				break;
			}
		}
	}

}
