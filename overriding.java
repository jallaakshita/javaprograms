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
		System.out.println("dog barks bowh-bowh");
	}
}

class overriding 
{
	public static void main(String args[])
	{
		Animal o=new Animal();		
		o.sound();
	}
}