// array is a collection of homogeneous elements having stored in contigeous memory location.

package Arrays;

public class Array_1 {

	public static void main(String[] args) {
		int i[]=new int[5];//instantiation or creating array object size
		i[0]=1;// value initialization
		i[1]=2;
		i[2]=3;
		i[3]=4;
		i[4]=5;
//		i[5]=10;// arrayIndexOutOfBoundsExceptions occurs because of size mismatch. the program terminates here.
//		for(int ir:i)
//		{
//			System.out.println(ir);
//		}
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);//1 2 3 4 5 
		}
	}

}
