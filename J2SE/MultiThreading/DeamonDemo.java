class DeamonDemo implements Runnable
{
	Thread th;
	DeamonDemo()
	{
		th=new Thread(this);
		th.setDaemon(true);
		th.start();
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is "+th.isDaemon());
		for(int i=0;i<10;i++)
		{
			System.out.println("Run: "+i);
		}
	}
	public static void main(String args[])
	{
		DeamonDemo dd=new DeamonDemo();
		System.out.println("Countdown Starts");
		for(int i=0;i<9;i++)
			System.out.println("Main: "+i);
	}
}