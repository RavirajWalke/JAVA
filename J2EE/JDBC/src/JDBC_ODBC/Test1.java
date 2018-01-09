package JDBC_ODBC;

import java.sql.*;

public class Test1
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
			String query="create table Student(Sid int,Sname varchar(30),Age int)";
			int i=st.executeUpdate(query);
			System.out.println(i+" rows affected");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
