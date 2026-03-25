import java.util.*;
class Animal
{
	void sound()
	{
		System.out.println("animal makes sound");
	}
}

class Dog extends Animal
{
	void sound()
	{
		System.out.println("dog makes bowh-bowh");
	}
}

class Cat extends Animal
{
	void sound()
	{
		System.out.println("cat makes meow-meow");
	}
}


class DynamicDispatch
{
	public static void main(String args[])
	{
		Animal obj;
		obj=new Dog();
		obj.sound();

		obj=new Cat();
		obj.sound();
	}
}