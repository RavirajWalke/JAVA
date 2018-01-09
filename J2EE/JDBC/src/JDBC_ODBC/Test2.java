package JDBC_ODBC;
import java.sql.*;
public class Test2
{
	public static void main(String args[])
	{
		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/studentinfo";
			String user="root";
			String pass="2014bcs021";
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connection Estabilished");
			Statement st=con.createStatement();
			//execute query
			String query="select * from student";
			ResultSet rs=st.executeQuery(query);
			//extract data
			if(!rs.next())
				System.out.println("Empty set");
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String Add=rs.getString(3);
				System.out.println(id+"   "+name+"   "+Add);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
