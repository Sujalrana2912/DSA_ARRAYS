package Array;
import java.util.*;
public class Move_End_Zero {
	public static int[] Move(int n,int a[])
	{
		int j=-1;
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				j=i;
				break;
			}
			
		}
		if(j==-1)
		{
			return a;
		}
		//move i and j and swap them 
		for(int i=j+1;i<n;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		return a;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter an elemnt:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

		Move(n,a);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
