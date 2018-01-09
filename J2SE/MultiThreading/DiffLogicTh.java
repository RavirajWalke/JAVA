class AddThread extends Thread
{
	int sum=0;
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			sum=sum+i;
			System.out.println(getName()+" :Sum="+sum);
		}
	}
}
class SubThread extends Thread
{
	int subt=0;
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			subt=subt-i;
			System.out.println(getName()+": Sub="+subt);
		}
	}
}
public class DiffLogicTh
{
	public static void main(String args[])
	{
		AddThread add=new AddThread();
		add.start();
		SubThread sub=new SubThread();
		sub.start();
		
	}
}