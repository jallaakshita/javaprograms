import java.util.*;
class PrimeRange
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a start range");
System.out.println("enter a end range");
int a,i,c;
a=sc.nextInt();
c=sc.nextInt();
if(a<2)
{
System.out.println("no prime numbers");
}
else
{
for(i=a;i<=c;i++)
{
if(isPrime(i))
{
System.out.println(i);
}
}
}
}
 

public static boolean isPrime(int b)
{
if(b<2)
{
return false;
}
for(int i=2;i<=Math.sqrt(b);i++)
{
if(b%i==0)
{
return false;
}
}
return true;
}
}

