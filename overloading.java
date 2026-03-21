import java.util.*;
class Animal
{
	void sound()
	{
		System.out.println("animal makes sound");
	}
	
	void sound (String name)
	{
		System.out.println(name + "makes bowh-bowh");
	}
}

class overloading 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Animal o=new Animal();		
		o.sound();
		o.sound("Dog");
	}
}