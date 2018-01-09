class Factory
{
	int items;
	boolean itemsInFact;
	synchronized void produce(int items)
	{
		if(itemsInFact)
		{
			try
			{
				wait();
			}
			catch(Exception e){e.printStackTrace();}
		}
		this.items=items;
		itemsInFact=true;
		System.out.println("Items: "+items);
		notify();
	}
	
	synchronized int consume()
	{
		if(!itemsInFact)
		{
			try{	wait();}
			catch(Exception e){e.printStackTrace();}
		}
		System.out.println("Items Consumed"+items);
		itemsInFact=false;
		notifyAll();
		return items;
	}
}

class Producer implements Runnable
{
	Factory fa;
	Producer(Factory fa)
	{
		this.fa=fa;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=1;
		while(i<=10)
		{
			fa.produce(i);
			i++;
		}
	}
}

class Consumer implements Runnable
{
	Factory fa;
	Consumer(Factory fa)
	{
		this.fa=fa;
		new Thread(this,"Consuer").start();
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			fa.consume();
		}
	}
}

public class ITCDemoFact
{
	public static void main(String args[])
	{
		Factory bajaj=new Factory();
		new Producer(bajaj);
		new Consumer(bajaj);
	}
}
