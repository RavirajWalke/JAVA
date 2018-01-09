class PrintNumbers1
{
	void print1to50()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.print(i+"\t");
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	void print50to1()
	{
		for(int i=50;i>0;i--)
		{
			System.out.print(i+"\t");
			try{
				Thread.sleep(100);
			}
			catch(Exception ie)
			{
				ie.printStackTrace();
			}
		}
	}
}

public class MultiThreadTime extends Thread
{
	static PrintNumbers1 pn1=new PrintNumbers1();
	public void run()
	{
		pn1.print1to50();
	}
	public static void main(String args[])
	{
		MultiThreadTime mtt=new MultiThreadTime();
		long time1=System.currentTimeMillis();
		mtt.start();
		System.out.println();
		pn1.print50to1();
		long time2=System.currentTimeMillis();
		System.out.println();
		System.out.println("Execution Time="+(time2-time1)/1000);
	}
}
