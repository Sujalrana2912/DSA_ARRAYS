package Array;
import java.util.*;
public class Longest_Array {
	
	public static void Largest(int arr[],int n)
	{
		int large=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i] > large)
			{
				large=arr[i];
			}
			
		}
		System.out.println(large);
	}
	
	public static void main(String[] args)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of element:");
	int n=sc.nextInt();
	
	
	int arr[]=new int[n];
	System.out.print("Enter a element:");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	Largest(arr,n);
	}
	
}
