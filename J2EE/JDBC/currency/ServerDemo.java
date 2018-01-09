package currency;
/**
 *
 * @author Ravi
 */
import java.util.*;
import java.net.*;
import java.io.*;
import java.sql.*;

class ServerDemo
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(3241);
			System.out.println("Waiting for Connection");
			Socket s=ss.accept();
			System.out.println("Connection to Client Estabilished");
			InputStream in=s.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			OutputStream out=s.getOutputStream();
			PrintStream ps1=new PrintStream(out);
			String From=br.readLine();
			String To=br.readLine();
			String Amt=br.readLine();
			float Amt1=Float.parseFloat(Amt);
			
			Scanner sc=new Scanner(System.in);
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/Currency";
			String user="root";
			String pass="2014bcs021";
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connection to Database Estabilished");
			String query="select Ratio from currency_ratio where c1=? and c2=?";
			PreparedStatement ps2=con.prepareStatement(query);
			ps2.setString(1,From );
			ps2.setString(2,To);
			ResultSet rs=ps2.executeQuery();
			while(rs.next())
			{
				float amt2=rs.getFloat(1);
				float val=amt2*Amt1;
				ps1.print(val);
				//System.out.println(val);
			}
			con.close();
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}