public class ExceptionDemo1
{
    public static void main(String args[])
    {
   int a=30,b=0,c,l;
   String s=null;
   try
   {
     c=a/b;
   }
   catch(ArithmeticException e)
   {
       System.out.println(e); 
   }
    try
   {
     l=s.length();
   }
   
   catch(Exception e)
   {
       System.out.println(e); 
   }
    }
}