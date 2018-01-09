class MyThread3 extends Thread
{
	MyThread3()
	{
		super();
	}
	MyThread3(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(getName()+" : "+i);
		}
	}
}
public class ThreadNamePriority
{
	public static void main(String args[])
	{
		MyThread3 mt1=new MyThread3();
		MyThread3 mt2=new MyThread3("child2");
		System.out.println("mt1 initial name:"+mt1.getName()+" and priority:"+mt1.getPriority());
		//System.out.println();
		System.out.println("mt2 initial name:"+mt2.getName()+" and priority:"+mt2.getPriority());
		System.out.println();
		mt1.setName("child1");
		mt1.setPriority(6);
		mt2.setPriority(9);
		System.out.println("mt1 initial name:"+mt1.getName()+" and priority:"+mt1.getPriority());
		System.out.println();
		System.out.println("mt2 initial name:"+mt2.getName()+" and priority:"+mt2.getPriority());
		mt1.start();
		mt2.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main : "+i);
		}
		
	}
	
}
