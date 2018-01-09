class D
{
    int a;
    D(int i)
    {
        a=i;
    }
    D ar()
    {
      D o=new D(a+10);
        return(o);
    }
}



public class Test3
{
    public static void main(String args[])
    {
        D o1=new D(21);
        D o2;
        o2=o1.ar();
        System.out.println(o1.a);
        System.out.println(o2.a);
    }
}
