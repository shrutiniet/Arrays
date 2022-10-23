package Arrays;
import java.util.*;
public class Rotation_1only {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int tmp=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=tmp;
		for(int x: arr)
			System.out.print(x+" ");

	}

}
