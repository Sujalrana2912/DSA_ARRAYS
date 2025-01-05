package Array;
import java.util.*;
public class Sort_array_0s1s2s {
	
	public static void Sort(int n,int a[])
	{
		int count0=0,count1=0,count2=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				count0++;
			}
			else if(a[i]==1){
				count1++;
			}
			else
			{
				count2++;
			}
		}
		for(int i=0;i<count0;i++)
		{
			a[i]=0;
		}
		for(int i=count0;i<count0+count1;i++)
		{
			a[i]=1;
		}
		for(int i=count0+count1;i<n;i++)
		{
			a[i]=2;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element");
		int n=sc.nextInt();

		int a[]=new int[n];
		System.out.println("Enter elemnt");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Unsorted");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		Sort(n,a);
		System.out.println("Sorted");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

}
