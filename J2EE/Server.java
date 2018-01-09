import java.net.*;
import java.io.*;

class Server 
{
   
   public static void main(String ra[])throws Exception
{String str;
ServerSocket serverSocket = new ServerSocket(8522);
            Socket server = serverSocket.accept();
            DataInputStream in = new DataInputStream(server.getInputStream());
str=in.readUTF();
System.out.println(str);
Boolean f=true;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream out = new DataOutputStream(server.getOutputStream());
while(f)
{

System.out.println("Type in message for client");
str=br.readLine();
out.writeUTF(str);
str=in.readUTF();
if(str.equalsIgnoreCase("exit"))
{
f=false;
}
System.out.println(str);

}

            server.close();
      
      }
}
 