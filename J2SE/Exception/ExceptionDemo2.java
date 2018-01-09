import java.util.*;
class asd
{
     int f;
    public void df()
    {
        Scanner sc = new Scanner(System.in);
       try
       {
         
         f=sc.nextInt();
         System.out.println(f);
       } 
       catch(InputMismatchException e)
       {
         System.out.println("enter correct input");
         this.df();
       }
    }
}
public class ExceptionDemo2 
{
   public static void main(String args[])
   {
       asd sd=new asd();
       sd.df();
   }
}
