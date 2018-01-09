package JDBC_ODBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Test3
{
	public static void main(String args[])
	{
		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/studentinfo";
			String user="root";
			String pass="2014bcs021";
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			String query1="select * from student";
			ResultSet rs=st.executeQuery(query1);
			//extract data
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String Add=rs.getString(3);
				System.out.println(id+"   "+name+"   "+Add);
			}
			Scanner sc=new Scanner(System.in);
			String Sid=sc.next();
			String query2="Delete from student where Sid="+Sid;
			int i=st.executeUpdate(query2);
			System.out.println(i+" rows affected");
			String query3="select * from student";
			 rs=st.executeQuery(query3);
			//extract data
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
