import java.net.*;
import java.io.*;

class Client
{
   public static void main(String [] args)throws Exception
   {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str="Hello";
         Socket client = new Socket(InetAddress.getLocalHost(), 8522);
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
while(!str.equals("exit"))
{

         str=br.readLine();
         out.writeUTF("ravi:"+str);
         InputStream inFromServer = client.getInputStream();
         DataInputStream in =new DataInputStream(inFromServer);
         System.out.println("Server:" + in.readUTF());

}
         client.close();
   }
}