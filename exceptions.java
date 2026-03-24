import java.util.Scanner;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}

class exceptions
{
	static void checkAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("not eligible for vote");
		}
		else
		{
			System.out.println("eligible for vote");
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter 2 numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int result=a/b;
			System.out.println("result"+result);
			System.out.println("enter age");
			int age=sc.nextInt();
			checkAge(age);
		}
		catch(ArithmeticException e)
		{
			System.out.println("pre defined exception caught"+e.getMessage());	
		}
		catch(InvalidAgeException e)
		{
			System.out.println("user defined exception caught"+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("general exception caught"+e.getMessage());
		}
		finally
		{
			System.out.println("program executed succesfully");
		}
	}
}