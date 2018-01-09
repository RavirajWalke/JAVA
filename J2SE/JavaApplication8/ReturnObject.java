class A
{
    int a,b;
    A(int i,int j)
    {
        a=i;
        b=j;
    }
    A display(A a1)
    {
        A d=new A(5,7);
        return d;
    }
    
}

class ReturnObject
{
  public static void main(String args[])
  {
      A a1=new A(2,3);
      //A a2;
      A a2=a1.display(a1);
     // System.out.println(a1.a+" "+a1.b);
      System.out.println(a2.a+" "+a2.b);
      
  }
}