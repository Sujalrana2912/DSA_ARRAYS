package Array;
import java.util.*;
public class Find_common {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of element:");
		Integer n=sc.nextInt();
		Integer a[]=new Integer[n];
		System.out.print("Enter elemnt for array1:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Integer b[]=new Integer[n];
		System.out.print("Enter elemnt for array2:");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		/*Integer a[]={4,2,3,1,6};
		Integer b[]={6,7,8,5,4};*/
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(a));
		ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(b));
		
		list.retainAll(list2);
		System.out.println("list"+list);
		
	}
}
