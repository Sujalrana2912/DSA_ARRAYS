package Array;
import java.util.*;
public class Reverse_Array {
	public static void Reverse(int n, int a[])
	{
		int first_Index=0, last_Index=a.length-1;
		while(first_Index < last_Index)
		{
			int temp=a[last_Index];
			a[last_Index]=a[first_Index];
			a[first_Index]=temp;
			first_Index++;
			last_Index--;
		}
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
		System.out.print("unsorted:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	Reverse(n,a);
	System.out.print("sorted:");
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	
		
	}
}
