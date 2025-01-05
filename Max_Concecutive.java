package Array;
import java.util.*;
public class Max_Concecutive
{
	public static int Find(int arr[])
	{
		int cnt=0;
		int maxi=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				cnt++;
			}
			else
			{
				cnt=0;
			}
			maxi= Math.max(maxi, cnt);
		}
		return maxi;
	}
	
	public static void main(String[] args)
	{
		int arr[]={1,1,0,1,1,1,0,1};
		System.out.println(Find(arr));
		
		
	}
}