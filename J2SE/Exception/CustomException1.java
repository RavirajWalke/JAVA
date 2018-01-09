import java.util.*;
class Exe extends Exception
{
  Exe(String s)
  {
    super(s)  ;
  }
}

public class CustomException1
{
  public static void main(String args[])
  {
      String s1;
      Scanner s=new Scanner(System.in);
      System.out.println("enter a string");
      s1=s.next();    
      try
      {
          
           if(s1=="Hello")
          {
              System.out.println("you entered correct");
              
          }
          else
          throw new Exe("NoMatchFound");
      }
      catch(Exe e)
      {          
          System.out.println(e.getMessage());          
      }
      
  }
}
