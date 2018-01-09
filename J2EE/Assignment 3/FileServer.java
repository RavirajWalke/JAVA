/*
 * @author RAVI
 */
 
import java.io.*;
import java.net.*;
import java.util.*;
class FileServer
{
  public static void main(String args[])
  {
	  try{
		  ServerSocket ss=new ServerSocket(4444);
	      System.out.println("Waiting for Connection");
	      Socket s=ss.accept();
	      System.out.println("Connection Estabilished");
	      InputStream in=s.getInputStream();
		  BufferedReader br1=new BufferedReader(new InputStreamReader(in));
	      OutputStream out=s.getOutputStream();
	      PrintStream ps=new PrintStream(out);
	      String str;
		  File f=null;
	      while((str=br1.readLine())!=null)
	      {
	      	f=new File(str);
	    	BufferedReader br2=new BufferedReader(new FileReader(f));
			String st;
		     while((st=br2.readLine())!=null)
			 {
				 //System.out.println(st);
				 ps.println(st);
			 }
	      }
		  out.close();
		  in.close();
		  s.close();
		  ss.close();
		}
	  catch(Exception e){};
  }
}