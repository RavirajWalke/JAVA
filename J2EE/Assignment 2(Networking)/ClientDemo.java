import java.net.*;
import java.io.*;
class ClientDemo
{
 public static void main(String args[])
 {
   try{
     InetAddress add=InetAddress.getLocalHost();
     Socket s=new Socket(add,1524);
     InputStream in=s.getInputStream();
     OutputStream out=s.getOutputStream();
     BufferedReader br=new BufferedReader(new InputStreamReader(in));
     String str;
     while((str=br.readLine())!=null)
     {
      System.out.println(str);
     }
     br.close();
     s.close();
   }
   catch(Exception e){}
 }
} 