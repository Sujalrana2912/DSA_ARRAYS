package Array;
import java.util.*;
public class Two_Sum_Problem {
	public static String Sum(int n,int a[],int target)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]== target)
				{
					return "Yes";
				}
			}
			
		}
		return "No";
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elemnt");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter an elemnt:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter target:");
		int target=sc.nextInt();
		System.out.println(Sum(n,a,target));
	}

}
