//JDBC Application to find the square of a number using CallableStatement 
package com.nt.jdbcproj1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CsTest1 {
private static final String QRY="{ call p_add1(?,?)}";
	public static void main(String[] args) {
		Scanner sc=null;
		int no=0;
		Connection con=null;
		CallableStatement cs=null;
		int result=0;
		try{
			sc=new Scanner(System.in);
			if(sc!=null)
			System.out.println("Enter the no. to found the square");
			no=sc.nextInt();
			//register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Shahuraj");
			//prepare the CallableStatement
			if(con!=null)
				cs=con.prepareCall(QRY);
		    if(cs!=null)
		    	cs.registerOutParameter(2,Types.INTEGER);
		    if(cs!=null)
		    	cs.setInt(1, no);
		    cs.execute();
		    if(cs!=null)
		    result=cs.getInt(2);
		    System.out.println("Square:"+result);
		}//try

		catch(SQLException se){
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}
		finally{
				try{
					if(cs!=null)
					cs.close();
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
		}//finally

	}//main

}//class
