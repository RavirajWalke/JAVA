class MyThread1 extends Thread
{
	int x;
	MyThread1()
	{
		x=5;
	}
	MyThread1(int x)
	{
		this.x=x;
	}
	public void run(int x)
	{
		for(int i=0;i<this.x;i++)
			System.out.println(getName()+"run:"+i);
	}
}
public class SameLogicMulThread
{
	public static void main(String args[])
	{
		MyThread1 mt1=new MyThread1();
		mt1.start();
		MyThread1 mt2=new MyThread1(10);
		mt2.start();
		MyThread1 mt3=new MyThread1(15);
		mt3.start();
		for(int i=0;i<20;i++)
		{
			System.out.println("main: "+i);
		}
	}
}
