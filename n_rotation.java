package Arrays;
import java.util.*;
public class n_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int rot=sc.nextInt();
		rot=rot%n;
		for(int i=0;i<rot;i++)
		{
			Rotate(arr);
		}
		for(int x: arr)
			System.out.print(x+" ");

	}
	public static void Rotate(int [] arr)
	{
		int tmp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=tmp;
	}

}
