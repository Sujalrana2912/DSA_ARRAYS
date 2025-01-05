package Array;
import java.util.*;
public class Linear_search {

	public static int Find_Linear(int arr[],int n,int num)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==num)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of element:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter an elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter a number that find in Linear search:");
		int num=sc.nextInt();
		System.out.println(Find_Linear(arr,n,num));
	}
}
