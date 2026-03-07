import java.util.*;
class switchcase
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int d;
System.out.println("enter a num");
d=sc.nextInt();
switch(d)
{
case 1: System.out.println("Sunday");
        break;
case 2: System.out.println("Monday");
        break;
case 3: System.out.println("tuesday");
        break;
case 4: System.out.println("wednesday");
        break;
case 5: System.out.println("thursday");
        break;
case 6: System.out.println("friday");
        break;
case 7: System.out.println("Satday");
        break;
default: System.out.println("ivalid ");
}
}
}


