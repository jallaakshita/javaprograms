import java.util.*;
class OneDArrayMethods
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int i,sum=0,avg,max,min,val;
			System.out.println("enter array size:");
			val=sc.nextInt();
			int a[]=new int[val];
			System.out.println("enter array elements:");
			for(i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			for(i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
			avg=sum/val;
			max=a[0];
			min=a[0];
			for(i=0;i<a.length;i++)
			{
				if(max<a[i])
					max=a[i];
				if(min>a[i])
					min=a[i];		
			}
System.out.println("sum of array elements:" + sum);
System.out.println("average of array elements:" + avg);
System.out.println("maximum number of array elements:" + max);
System.out.println("minimum of array elements:" + min);
}
}