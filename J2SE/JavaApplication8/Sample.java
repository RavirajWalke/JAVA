class MethodOverloading
{
    void disp(char s)
    {
         System.out.println(""+s);
    }
    void disp(char s, int n)  
    {
         System.out.println(s + " "+n);
    }
}

public class Sample
{
   public static void main(String args[])
   {
       MethodOverloading a1 = new MethodOverloading();
       a1.disp('S');
       a1.disp('S',50);
   }
}
