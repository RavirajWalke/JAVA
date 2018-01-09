class NewThread3 implements Runnable
{
	Thread t;
	String name;
	NewThread3(String ThreadName)
	{
		name=ThreadName;
		t=new Thread(this,name);
		System.out.println("Child Thread : "+t);
		t.start();
	}
	public void run()
	{
		try
		{
		for(int i=0;i<5;i++)
		{
			System.out.println(name+" : "+i);
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
			System.out.println(name+" Interupted");
		}
		System.out.println("Exited from "+name);
	}
}

public class JoinDemo
{
	public static void main(String args[])
	{
		NewThread3 ob1=new NewThread3("First");
		NewThread3 ob2=new NewThread3("Second");
		NewThread3 ob3=new NewThread3("Third");
		
		System.out.println("Thread one is Alive:"+ob1.t.isAlive());
		System.out.println("Thread two is Alive:"+ob2.t.isAlive());
		System.out.println("Thread three is Alive:"+ob3.t.isAlive());
		
		try
		{
			System.out.println("Waiting for Treads to finish");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
     	}
		catch(Exception e)
		{
			System.out.println("Main Thrad Interupted");
		}
		System.out.println("Thread one is Alive:"+ob1.t.isAlive());
		System.out.println("Thread two is Alive:"+ob2.t.isAlive());
		System.out.println("Thread three is Alive:"+ob3.t.isAlive());
		
		
		System.out.println("Exiting from main Thread");
  }
}