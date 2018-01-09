class NewThread1 extends Thread
{
	Thread t;
	NewThread1()
	{
		super("Demo Tread");
		System.out.println("Child Thread : "+this);
		start();
	}
	public void run()
	{
		try
		{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread : "+i);
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
			System.out.println("Child Interupted");
		}
		System.out.println("Exited from Child");
	}
}

public class ExtendThread
{
	public static void main(String args[])
	{
		new NewThread1();
		System.out.println("Main Thread : "+Thread.currentThread());
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Main Thread : "+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Main Interupted");
		}
		System.out.println("Exited from Main");
	}
}