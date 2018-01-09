import java.sql.*;
import java.net.*;
import java.io.*;
public class Server
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/d1","root","10001011");
			System.out.println("Database Connected");
			ServerSocket srs = new ServerSocket(4567);
			Socket s = srs.accept();
			System.out.println("Client Connected");
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream psm = new PrintStream(s.getOutputStream());
			PreparedStatement ps = c.prepareStatement("select * from cr");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
				psm.println(rs.getInt(1)+". "+rs.getString(2)+" to "+rs.getString(3));
			psm.println("finish");
			int choice = Integer.parseInt(br.readLine());
			System.out.println("Choice Received : "+choice);
			ps = c.prepareStatement("select c1,c2,ratio from currency_ratio where id="+choice);
			rs = ps.executeQuery();
			rs.next();
			String c1 = rs.getString(1);
			String c2 = rs.getString(2);
			float ratio = rs.getFloat(3);
			int n;
			psm.println(c1+" : ");
			n = Integer.parseInt(br.readLine());
			psm.println(c2+" : "+n*ratio); 
			rs.close();
			psm.close();
			psm.close();
			br.close();
			c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
