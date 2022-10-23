package Arrays;
import java.util.*;
public class Rotate_in_single_step {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int rot=sc.nextInt();
		if(rot<0)  //for right shift
		{
			rot=rot+n;
		}
		rot=rot%n;
		Reverse(arr,0, n-1); // for rotate 1 time whole array
		Reverse(arr,0, rot-1); // for rotate 2 part (rotation one
		Reverse(arr, rot, n-1);// rest part
		for(int x:arr)
		{
			System.out.print(x+" ");
		}

	}
	public static void Reverse(int [] arr, int s, int e)
	{
		while(s<e)   //reverse algo
		{
			int tmp=arr[s];
			arr[s]=arr[e];
			arr[e]=tmp;
			s++;
			e--;
		}
		
	}

}
