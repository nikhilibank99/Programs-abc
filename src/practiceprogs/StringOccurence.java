package practiceprogs;

import java.util.Scanner;

public class StringOccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String input=sc.nextLine();
		System.out.println("Enter a particular character");
		char ch=sc.nextLine().charAt(0);// character given from keyboard
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(ch==input.charAt(i))
			{
				count++;//1
				
			}
			
		}
		System.out.println("Number of occurence of "+ch+"= " +count);
		
		

	}

}