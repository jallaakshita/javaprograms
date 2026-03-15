import java.util.*;
class Palin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equalsIgnoreCase(reverse))
		{
			System.out.println("entered string is palindrome");
		}
		else
		{
			System.out.println("entered string is not palindrome");

		}
	}
}