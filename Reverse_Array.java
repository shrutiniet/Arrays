package Arrays;
import java.util.*;
public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int end=n-1;
		int start=0;
		for(int i=start;i<n/2;i++)
		{
			int tmp=arr[end];
			arr[end]=arr[start];
			arr[start]=tmp;
			start++;
			end--;
		}
		for(int x:arr)
			System.out.println(x);

	}

}
