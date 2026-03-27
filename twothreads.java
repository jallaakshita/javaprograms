class Mythread1 extends Thread
{
	public void run()
	{
		System.out.println("thread is running using extending thread class");
	}
}

class Mythread2 implements Runnable
{
	public void run()
	{
		System.out.println("thread is running implementing runnable interface");
	}
}

class twothreads
{
	public static void main(String args[])
	{
		Mythread1 t1=new Mythread1();
		t1.start();
		Mythread2 t2=new Mythread2();
		Thread obj=new Thread(t2);
		obj.start();
		
	}
}