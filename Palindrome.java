import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,r,n,rev=0;
		System.out.println("enter a number:");
		num=sc.nextInt();
		n=num;
		while(num!=0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(n==rev)
		{
			System.out.println("palindrome number");	
		}
		else
		{
			System.out.println("not palindrome number");
		}
	}
}