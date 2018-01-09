
//JDBC APP TO INSERT THE STUDENT DETAILS INTO STUDENT TABLE

package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PstInsertTest {

	public static void main(String[] args)throws Exception {
		//read Student count
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student count:");
		int cnt=sc.nextInt(); 
		//register jdbc driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Estalish the connection 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Shahuraj");
		//prepare Query
		String qry="insert into student values(?,?,?)";
		//create PreparedStatement obj representing Pre-compiled SQL Query
		PreparedStatement ps=con.prepareStatement(qry);
		// read student details from enduser
		for(int i=1;i<=cnt;i++){
			//get each student details
			System.out.println("Enter "+i+" student details");
			System.out.println("Enter no:");
			int no=sc.nextInt();
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter addrs");
			String addrs=sc.next();
			//set each student details query to params(?)
			ps.setInt(1,no);
			ps.setString(2,name);
			ps.setString(3,addrs);
			//execute the Query to insert each student details
			int result=ps.executeUpdate();
			//process the reuslt
			if(result==0)
				System.out.println(i+" student not inserted");
				else
			System.out.println(i+" records inserted");
		}//for
		
		//close jdbc objs
		ps.close();
		con.close();
	}//main
}//class

