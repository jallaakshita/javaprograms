import java.util.*;
class table
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n;
System.out.println("enter table number");
n=sc.nextInt();
for(i=1;i<=12;i++)
{
System.out.println(n+"x"+i+"="+(n*i));
}
}
}