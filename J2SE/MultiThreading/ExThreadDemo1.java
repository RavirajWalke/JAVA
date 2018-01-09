
public class ExThreadDemo1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("run: "+i);
	}
	public static void main(String args[])
	{
		ExThreadDemo1 w=new ExThreadDemo1();
		w.start();
		w.run();
		for(int i=0;i<5;i++)
			System.out.println("Main : "+i);
	}
}
