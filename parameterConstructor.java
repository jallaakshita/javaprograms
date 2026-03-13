import java.util.*;
class parameterConstructor
{
	int age;
	String name;
	parameterConstructor(int a,String b)
	{
		age=a;
		name=b;
	}
	
	public static void main(String args[])
	{
		parameterConstructor obj=new parameterConstructor(19,"Akhila");
		System.out.println("name is "+obj.name);
		System.out.println("age is "+obj.age);
	}
}