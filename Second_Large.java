package Array;
import java.util.*;
public class Second_Large {

	public static void Secondlarge(int n,int arr[])
	{
		int largest=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		int second_larg=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>second_larg && arr[i]!=largest )
			{
				second_larg=arr[i];
			}
		}
		System.out.print("Second largest:"+ second_larg);
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elemnt");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter number of elemnt");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Secondlarge(n,arr);
	}
}
