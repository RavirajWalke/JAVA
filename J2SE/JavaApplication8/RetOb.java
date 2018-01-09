class Abc
{
   int x,y;
   Abc()
           {
               
           }
    Abc(int i,int j) 
    {
        x=i;
        y=j;
    }
    Abc display(Abc o)
    {
     o.x=o.x+10;
     o.y=o.y+10;
     return o;
    }
}




public class RetOb 
{
   public static void main(String args[])
   {
     Abc a1=new Abc(2,3);
     Abc a2=new Abc();
     a2=a2.display(a1);
     System.out.println(a2.x+" "+a2.y);
   }
}
