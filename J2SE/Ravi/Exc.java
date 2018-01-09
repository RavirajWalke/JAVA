class A 
{
 void ab(){}
}
class B extends A{
    void ab()
  {
      try
      {
      throw new ArithmeticException("msg");
      }
      catch(Exception e){
          System.out.println("exception caught");
      }
  }
}

public class Exc
{
 public static void main(String args[])
 {
     B a=new B();
     a.ab();
 }
}
