package Arrays;

import java.util.Scanner;

public class MultiArrays_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("enter Array of elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Display Elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ "\t");
		}
	}

}
