package DBStudents;

import java.sql.*;
import java.util.*;

public class JDBCDemo1
{
	public static void main(String args[])
	{
		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/students";
			String user="root";
			String pass="2014bcs021";
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connection with Database Estabilished");
			Statement st=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Table_Name");
			String Table_Name=sc.next();
			String query1="create table "+ Table_Name+"(Sid int,Sname varchar(30),Age int)";
			int i;
			i=st.executeUpdate(query1);
			System.out.println("Created table "+Table_Name);
			System.out.println(i+" rows affected");
					
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

