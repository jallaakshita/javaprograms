import java.util.*;
class Person
{
	String name="Akhila";
}

class Student extends Person
{
	int rollnum=91;
	void display()
	{
		System.out.println("My name is "+ name +  " and my roll number is "+rollnum);
	}
}

class subclasses
{
	public static void main(String args[])
	{
		Student obj=new Student();
		obj.display();
	}
}
