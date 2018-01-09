import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PingPong2
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(4444);
			System.out.println("waiting for connection");
			Socket s=ss.accept();
			System.out.println("Connection Estabilished");
			InputStream in=s.getInputStream();
			OutputStream out=s.getOutputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			PrintStream ps=new PrintStream(out);
			String send,receive;
        while((receive=br.readLine())!=null)
        {
            if(receive.equalsIgnoreCase("ping"))
                send="pong";
            else
                send="Enter correct msg";
        ps.println(send);//write to client
    }
			ps.close();
			br.close();
			ss.close();
		}
		catch(Exception e){}
	}
}
