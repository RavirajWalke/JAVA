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
public class ClienDemo1
{
    public static void main(String args[])
    {
         Socket s=null;
        try
        {
            InetAddress add=InetAddress.getLocalHost();
             s=new Socket(add,4321);
            InputStream in=s.getInputStream();
            
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            OutputStream out=s.getOutputStream();
            PrintStream ps=new PrintStream(out);
            String msg;
            while((msg=br.readLine())!=null)
            {
                ps.println("I got Your msg");
                System.out.println(msg);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                s.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
