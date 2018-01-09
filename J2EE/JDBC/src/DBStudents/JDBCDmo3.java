package DBStudents;


import java.sql.*;
import java.util.Scanner;
public class JDBCDmo3
{
	public static void main(String args[])
	{
		//load Driver
		try{
		//Class.forName("com.mysql.jdbc.Driver()");
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//get Connection
		String url="jdbc:mysql://localhost:3306/students";
		String user="root";
		String pass="2014bcs021";
		Connection con=DriverManager.getConnection(url,user,pass);
		System.out.println("Connection Estabilished");
		//execute statements using Cinnection con
		Statement st=con.createStatement();
		//get values
		System.out.println("enter values");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter age");
		int age=sc.nextInt();
		String query="Insert Into Student(Sid,Sname,Age) Values("+id+",'"+name+"',"+age+")";
		//execute query
		int i=st.executeUpdate(query);
		System.out.println(i+"rows affected");
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
