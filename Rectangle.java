import java.util.*;
class Rectangle
{
float l,b,p,a;
void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter length");
l=sc.nextFloat();
System.out.println("enter breadth");
b=sc.nextFloat();
}
void area()
{
a=l*b;
System.out.println("area"+a);
}
void perimeter()
{
p=2*(l+b);
System.out.println("perimeter"+p);
}

public static void main(String args[])
{
Rectangle obj=new Rectangle();
Rectangle obj1=new Rectangle();
obj.read();
obj.area();
obj.perimeter();
obj1.read();
obj1.area();
obj1.perimeter();
}
}

