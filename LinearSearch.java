import java.util.*;
class LinearSearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int search,i,size,found=0;
		System.out.println("enter a size of array:");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array elements:");
		for(i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}

		System.out.println("enter a search number:");
		search=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				found=1;			
			}		
		}
		if(found==1)
		{
		System.out.println("search element is found");
		}
		else
		{
		System.out.println("search element is found");
		}
	}
}