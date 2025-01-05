package Array;
import java.util.*;
public class Remove_Duplicat_Arrayfrom_Sort {
	public static void Find_Duplicate(int n,int a[])
	{
		int i=0;
		for(int j=1;j<n;j++)
		{
			if(a[j]!=a[i])
			{
				a[i+1]=a[j];
				i++;
			}
			
		}
		System.out.print("Remove"+i+1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eter an number of Element:");
		int  n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Find_Duplicate(n,a);
	}

}
