package Arrays;

public class MultiArrays {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
//		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=a.length;j++)	
			{
				System.out.print(a[i][j]+ "\t");
			}
		System.out.println();
		}
	}

}
