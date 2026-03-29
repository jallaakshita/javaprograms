import java.util.*;
class defaultConstructor
{
	int age;
	String name;
	defaultConstructor()
	{
		age=19;
		name="Akshita";
	}
	
	public static void main(String args[])
	{
		defaultConstructor obj=new defaultConstructor();
		System.out.println("name is "+obj.name);
		System.out.println("age is "+obj.age);
	}
}