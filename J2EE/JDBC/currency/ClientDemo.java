package currency;
/**
 *
 * @author Ravi
 */
import java.net.*;
import java.sql.*;
import java.io.*;
import java.util.*;
class ClientDemo
{
	public static void main(String args[])
	{
		try
		{
			InetAddress add=InetAddress.getLocalHost();
			Socket s=new Socket(add,3241);
			InputStream in=s.getInputStream();
			Scanner sc1=new Scanner(in);
			OutputStream out=s.getOutputStream();
			PrintStream ps=new PrintStream(out);
			Scanner sc=new Scanner(System.in); 
			System.out.println("Enter FromCurrency");
			String FC=sc.next();
			ps.println(FC);
			System.out.println("Enter ToCurrency");
			String TC=sc.next();
			ps.println(TC);
			System.out.println("Enter Amount");
			float AM=sc1.nextFloat();
			ps.println(AM);
			String coam=sc.next();
			System.out.println(FC+":"+AM+" to "+TC+" = "+coam);
		}
	    catch(Exception e)
		{
	    	System.out.println(e);
		}
	}
}