import java.util.*;
class FactorialRecursion
{
	double Recursivefunction(int n)
		{
			if(n==0 || n==1)
				return 1;
			else
				return n*Recursivefunction(n-1);
		}


	double Iterativefunction(int m)
		{
			if(m==0 || m==1)
			{
				return 1;
			}
			else
			{
				int fact=1;
				for(int i=1;i<=m;i++)
				{
					fact=fact*i;
				}
			return fact;		
			}
					}
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int num;
			System.out.println("enter num value:");
			num=sc.nextInt();
			FactorialRecursion obj=new FactorialRecursion();
			System.out.println("Recursive factorial :" + obj.Recursivefunction(num));
			System.out.println("Iterative factorial :" + obj.Iterativefunction(num));
		}
}

