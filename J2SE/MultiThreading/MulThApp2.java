public class MulThApp2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(getName()+" Run: "+i);
		}
	}
	public static void main(String args[])
	{
		MulThApp2 mt1=new MulThApp2();
		mt1.start();
		MulThApp2 mt2=new MulThApp2();
		mt2.start();
		MulThApp2 mt3=new MulThApp2();
		mt3.start();
	}
}
