package Currency;
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
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
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
			float AM=sc.nextFloat();
			ps.println(AM);
			
			System.out.println(FC+":"+AM+" to "+TC+" = ");
		}
	    catch(Exception e)
		{
	    	System.out.println(e);
		}
	}
}