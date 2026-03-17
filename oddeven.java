import java.util.*;
class oddeven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,r;
String ans;
System.out.println("enter a num");
a=sc.nextInt();
r=a-((a/2)*2);
ans=(r==0)?"even num":"odd num";
System.out.println(ans);
}
}