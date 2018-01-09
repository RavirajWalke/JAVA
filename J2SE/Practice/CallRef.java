class Ref
{
   int x,y;
   Ref()
   {
       
   }
    Ref(int a,int b)
    {
        x=a;
        y=b;
    }
    void change(Ref o)
    {
        int t;
        t=o.x;
        o.x=o.y;
        o.y=t;
        
    }
    void display()
    {
        System.out.println("x= "+x+ " y= "+y);
    }
    
}
public class CallRef
{
public static void main(String args[])
{
    Ref a1=new Ref();
    Ref a2=new Ref(20,30);
   a2.display();
    a1.change(a2);
    a2.display();
   

}
}
