class A extends Thread
{
    public void run()
    {
       for(int i=1;i<5;i++)
       {
           if(i==1)
               yield();
           System.out.println("Thred A: "+i);
       }
        System.out.println("exit from thread A");
    }
}
class B extends Thread
{
    public void run()
    {
       for(int j=1;j<5;j++)
       {
           System.out.println("Thred B: "+j);
           if(j==3)
               stop(); 
       }
        System.out.println("exit from thread B"); 
    }
}
class C extends Thread
{
    public void run()
    {
        for(int k=1;k<5;k++)
       {
           System.out.println("Thred C: "+k);
           if(k==1)
               try
               {
               sleep(1000);
               }
           catch(Exception e)
           {
               
           }
       }
        System.out.println("exit from thread C");
    }
}
public class ThreadTest
{
  public static void main(String args[])
  {
      A a=new A();
      a.start();
      new B().start();
      new C().start();
      
  }
}
