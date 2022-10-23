package Arrays;
import java.util.*;
public class Search_Ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int ele=sc.nextInt();
		int loc=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==ele)
				loc=i+1;
		}
		if(loc>0)
		System.out.println("Found at "+loc);
		else
			System.out.println("Not Found");

	}

}
