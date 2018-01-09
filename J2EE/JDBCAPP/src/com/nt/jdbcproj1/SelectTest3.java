//jdbs app that gives student details based on start ,end ranges of sno
package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectTest3 {

	public static void main(String[] args) {
		
Scanner sc=null;
int start=0;
int end=0;
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;
boolean flag=false;

try{
	sc=new Scanner(System.in);
			System.out.println("Enter Starting index");
	start=sc.nextInt();
	System.out.println("Enter Ending index");
	end=sc.nextInt();
	//Register jdbc driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//Establish the connection
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Shahuraj");
	//Create PreparedStatement
	if(con!=null)
		ps=con.prepareStatement("SELECT * FROM STUDENT WHERE SID>=? AND SID<=?");
	ps.setInt(1,start);
	ps.setInt(2, end);
	//Process the result
	if(ps!=null)
		rs=ps.executeQuery();
	if(rs!=null)
	{
	while(rs.next()){
		
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		flag=true;
	}//while
	}//if
	if(flag==false)
		System.out.println("NO records");
	else
		System.out.println("records");
	
}//try
catch(SQLException se)
{
 se.printStackTrace();
}//catch
catch(ClassNotFoundException cnf)
{
 cnf.printStackTrace();
}//catch
catch(Exception e)
{
 e.printStackTrace();
}//catch
finally{
	try{
		if(rs!=null)
		rs.close();
	}
	catch(SQLException se)
	{
	 se.printStackTrace();
	}//catch
	try{
		if(ps!=null)
		ps.close();
	}
	catch(SQLException se)
	{
	 se.printStackTrace();
	}//catch
	try{
		if(con!=null)
		con.close();
	}
	catch(SQLException se)
	{
	 se.printStackTrace();
	}//catch
	try{
		if(sc!=null)
		sc.close();
	}
	catch(Exception e)
	{
	 e.printStackTrace();
	}//catch
}//finally
	}//main

}//class
