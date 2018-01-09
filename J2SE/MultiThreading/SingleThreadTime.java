class PrintNumbers
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

public class SingleThreadTime
{
	public static void main(String args[])
	{
		PrintNumbers pn=new PrintNumbers();
		long time1=System.currentTimeMillis();
		pn.print1to50();
		System.out.println();
		pn.print50to1();
		long time2=System.currentTimeMillis();
		System.out.println();
		System.out.println("Execution Time="+(time2-time1)/1000);
	}
}
