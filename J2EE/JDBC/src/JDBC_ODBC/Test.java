package JDBC_ODBC;

import java.sql.*;
import java.util.Scanner;
public class Test
{
	public static void main(String args[])
	{
		//load Driver
		try{
		//Class.forName("com.mysql.jdbc.Driver()");
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//get Connection
		String url="jdbc:mysql://localhost:3306/studentinfo";
		String user="root";
		String pass="2014bcs021";
		Connection con=DriverManager.getConnection(url,user,pass);
		System.out.println("Connection Estabilished");
		//execute statements using Cinnection con
		Statement st=con.createStatement();
		//get values
		System.out.println("enter values");
		//String name="SHAHAJI NARWADE";
		//String Address="AT POST:KURUNDA TQ:BASMATNAGAR DIST:HINOGLI";
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String Address=sc.nextLine();
		String query="Insert Into Student(Sname,Address) Values('"+name+"','"+Address+"')";
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
