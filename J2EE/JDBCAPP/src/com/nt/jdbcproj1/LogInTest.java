//LogInTest App that arise SQLInjection Problem

package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LogInTest {

	public static void main(String[] args) {
		//take Inputs
		Scanner sc=null;
		String uname=null;
		String psw=null,qry=null;
		Connection con =null;
		Statement st=null;
		ResultSet rs=null;
		int cnt=0;
		try{
			sc=new Scanner(System.in);
		if(sc!=null){
			
			System.out.println("Enter UserName");
		    uname=sc.nextLine();
		    System.out.println("Enter PassWord");
		    psw=sc.nextLine();
		}
		uname="'"+uname+"'";
		psw="'"+psw+"'";
		//qry="Select count(*) from logintest where uname='Shahaji'and psw='Shahuraj'
		qry="Select count(*) from logintest where uname="+uname+"and pwd="+psw;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","Shahuraj");
		if(con!=null){
		st=con.createStatement();
		}
		//create qury
		if(st!=null){
			rs=st.executeQuery(qry);	
		}
		if(rs.next()){
			cnt=rs.getInt(1);
		}
		if(cnt==0){
			System.out.println("Invalid Credentials");
		}
		else{
			System.out.println("valid Credential");
		}}
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}
		finally{
			
				try{
					if(rs!=null)
					rs.close();
				}
				catch (SQLException se){
					se.printStackTrace();
				}
				try{
					if(st!=null)
					st.close();
				}
			catch (SQLException se1){
			
			se1.printStackTrace();}
				try{
					if(con!=null)
					con.close();
				}
			catch (SQLException e){
			e.printStackTrace();}
		         try{
		        	 if(sc!=null)
		        		 sc.close();
		         }//try
		         catch (Exception e){
		 			e.printStackTrace();}
		 		    
  		}
	}

}
