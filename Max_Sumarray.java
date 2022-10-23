package Arrays;
import java.util.*;
public class Max_Sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int s=0;
		int e=n-1;
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=s;i<=e;i++)
		{
			sum=sum+arr[i];
			if(sum<0)
			{
				sum=0;				
			}
			if(sum>max)
				max=sum;
		}
		System.out.println(max);

	}

}
