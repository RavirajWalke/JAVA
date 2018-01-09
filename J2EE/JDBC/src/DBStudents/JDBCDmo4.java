package DBStudents;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDmo4
{
	public static void main(String args[])
	{
		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/students";
			String user="root";
			String pass="2014bcs021";
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id to delete");
			String Sid=sc.next();
			String query1="Delete from student where Sid="+Sid;
			int i=st.executeUpdate(query1);
			System.out.println(i+" rows affected");
			
			String query="select * from Student";
			ResultSet rs=st.executeQuery(query);
			//extract data
			while(rs.next())
			{
				 
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int age=rs.getInt(3);
				System.out.println(id+" "+name+" "+age);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
