package Array;
import java.util.*;
public class Check_Array_Sort {

	public static boolean Sorted(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			if(arr[i]>=arr[i-1])
			{
				//System.out.println("Sorted");

			}
			else{
				System.out.println("Not sorted");
				return false;
			}
		}
		System.out.println("Sorted");
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of felemnt:");
		int  n=sc.nextInt();
		int arr[] =new int[n];
		System.out.print("Enter a elemnt:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Sorted(arr,n);
	}
}
