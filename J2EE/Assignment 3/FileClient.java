/*
 * @author RAVI
 */

import java.io.*;
import java.net.*;
import java.util.*;
class FileClient
{
  public static void main(String args[])
  {
	try{
		Socket s=new Socket(InetAddress.getLocalHost(),4444);
	    InputStream in=s.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
	    OutputStream out=s.getOutputStream();
		PrintStream ps=new PrintStream(out);
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter FileName");
	    String fname=sc.next();
	    ps.println(fname);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		in.close();
		out.close();
		s.close();
	}
	catch(Exception e){};
  }
}