package Array;
import java.util.*;
public class Missing_Element {

	public static int  Find(int a[],int n)
	{
		int xor1=0,xor2=0;
		for(int i=0;i<n-1;i++)
		{
			xor2^=a[i];
			xor1^=(i+1);
		}
		xor1^=n;
		return xor1^xor2;
	}
	/*public static int LinearSearch(int a[],int n)
	{
		for(int i=0;i<=n;i++)
		{
			int flag=0;
			for(int j=0;j<n-1;j++)
			{
				if(a[j]==i)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				return i;
			}
		}
		return -1;
	}*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter an element:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print(Find(a,n));
		//System.out.println(LinearSearch(a,n));
	}
}
