class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		t=new Thread(this,"Demo Thread");
		System.out.println("Child Thread : "+t);
		t.start();
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
public class RunnIntDemo
{
	public static void main(String args[])
	{
		new NewThread();
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