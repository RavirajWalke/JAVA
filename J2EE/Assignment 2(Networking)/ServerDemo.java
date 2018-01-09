import java.net.*;
import java.io.*;
import java                                                                                              .util.*;
class ServerDemo
{
  public static void main(String args[])
  {
    try{
      ServerSocket ss=new ServerSocket(1524);
      Socket s=ss.accept();
      InputStream in=s.getInputStream();
      OutputStream out=s.getOutputStream();
      Scanner sc=new Scanner(System.in);
      PrintStream ps=new PrintStream(out);
      System.out.println("Read message from keyboard");
      String str=sc.nextLine();
      ps.println(str);
      ps.close();
      s.close(); 
     ss.close();
    }
    catch(Exception e){}
  }
}