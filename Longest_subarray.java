package Array;
import java.util.*;
public class Longest_subarray {

	public static int Subarry(int n, int a[], int K)
	{
		int len=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				long s=0;
				for(int  k=i;k<=j;k++)
				{
					s+=a[k];
				}
				if(s==K)
				{
					len=Math.max(len, j-i+1);
				}
				
			}
			
		}
		return len;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter an elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int K=10;
		System.out.println(Subarry(n,a,K));
		
	}
	
}
