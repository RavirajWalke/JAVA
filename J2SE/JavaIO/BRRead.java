import java.io.*;
public class BRRead 
{
  public static void main(String args[])throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      char ch;
      System.out.println("enter the characters");
      do{
       ch=(char) br.read();
          System.out.println(ch);
      }
      while(ch!='q');
  }
}
