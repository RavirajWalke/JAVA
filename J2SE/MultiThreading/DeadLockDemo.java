class Firstclass
{
	synchronized void fcmethod(SecondClass sc)
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+"Fc.fcmethod");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){e.printStackTrace();}
		System.out.println(name+" is trying to call sc.lastmethod");
		sc.lastmethod();
	}
	public void lastmethod()
	{
		System.out.println("in fc.last method");
	}
}
class SecondClass
{
	synchronized void scmethod(Firstclass fc)
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+"sc.scmethod");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){e.printStackTrace();};
		System.out.println(name+" is trying to call fc.lastmethod");
		fc.lastmethod();
	}
	public void lastmethod()
	{
		System.out.println("inside sc.lastmethod");
	}
}
public class DeadLockDemo implements Runnable
{
	Firstclass FC=new Firstclass();
	SecondClass SC=new SecondClass();
	DeadLockDemo()
	{
		Thread th=new Thread(this,"Racing Thread");
		th.start();
		
		FC.fcmethod(SC);//main Thread Locked FC object
		System.out.println("Back in Main Thread");
	}
	public void run()
	{
		SC.scmethod(FC);//Racing Thread object locked SC object.
		System.out.println("Back in other Thread");
	}
	public static void main(String args[])
	{
		new DeadLockDemo();
	}
}
