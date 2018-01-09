import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class PingPong1
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			InetAddress add=InetAddress.getLocalHost();//obtain ip address
			Socket s=new Socket(add,4444);//create socket
			
			
			InputStream in=s.getInputStream();//obtain streams
			OutputStream out=s.getOutputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			PrintStream ps=new PrintStream(out);
			String send,recieve;
			System.out.println("Enter message");
			while(true)
			{
				send=sc.nextLine();//read from k/b
            if(send.equalsIgnoreCase("exit"))
                break;
            else
                ps.println(send);//send to server
               //read data from server
            recieve=br.readLine();
            System.out.println(recieve);
			}
			ps.close();
			br.close();
			s.close();
		}
		catch(Exception e){}
	}
}
