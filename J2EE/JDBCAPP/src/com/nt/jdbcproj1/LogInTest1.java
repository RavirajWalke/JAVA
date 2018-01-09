
//LOgINtest Without SQL Injection problem

package com.nt.jdbcproj1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LogInTest1 {
	
	public static void main(String[] args)throws Exception {
		//read input values
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name");
		String user=sc.nextLine();  //gives raja
		System.out.println("Enter password");
		String pass=sc.nextLine();  //gives rani
		
		// register jdbc driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Shahuraj");
		//prepare SQL Query
		String qry="select count(*) from logintest where uname=? and pwd=?";
		PreparedStatement ps=con.prepareStatement(qry);
		//set query param values
		ps.setString(1,user);
		ps.setString(2,pass);
		//execute the SQL Query
		ResultSet rs=ps.executeQuery();
		//process the ResultSet
		int cnt=0;
		if(rs.next()){
			cnt=rs.getInt(1);
		}
		if(cnt==0)
			System.out.println("InValid Credentials");
		else
			System.out.println("Valid Credentials");
		
		//close jdbc objs
		rs.close();
		ps.close();
		con.close();
	
	}//main
}//class

