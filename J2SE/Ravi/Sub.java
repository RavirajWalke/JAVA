import java.io.*;
class Super
{
 void show() throws ArithmeticException 
  {  System.out.println("parent class");  }
}

public class Sub extends Super {
 void show() throws ArithmeticException         		//Cmpile time Error  	  
   { System.out.println("child class"); } 

 public static void main(String[] args)
 {
  try {
   Super s=new Sub();
   s.show();
   }
  catch(Exception e){}
 }  
}
