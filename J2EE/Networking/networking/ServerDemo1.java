/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

/**
 *
 * @author Ravi
 */
import java.io.*;
import java.net.*;
public class ServerDemo1
{
    public static void main(String args[])throws Exception
    {
        ServerSocket ss=new ServerSocket(4321);
        System.out.println("Waiting for Connection");
        Socket s=ss.accept();
        System.out.println("Connection Estabilished");
        InputStream in=s.getInputStream();
        OutputStream out=s.getOutputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        PrintStream ps=new PrintStream(out);
        String msg="Hi there how are you?";
        ps.println(msg);
        msg=br.readLine();
        if(msg!=null)
            System.out.println(msg);
        s.close();
        
    }
}
