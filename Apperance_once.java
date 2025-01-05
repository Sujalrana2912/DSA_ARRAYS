package Array;
import java.util.*;
public class Apperance_once {
	public static int Find(int n,int a[])
	{
		int  xor=0;
		for(int i=0;i<n;i++)
		{
			xor=xor^a[i];
		}
		return xor;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter element:");
		for(int i=0;i<n;i++)
			
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(Find(n,a));
	}

}
