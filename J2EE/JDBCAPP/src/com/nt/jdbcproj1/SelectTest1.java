package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;

public class SelectTest1 {

	public static void main(String[] args) {
		Connection con=null;
		try{
			//Register Jdbc Driver
          Class.forName("oracle.jdbc.driver.OracleDriver");
          //Establish the connection
           con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Shahuraj");
          if(con==null)
          System.out.println("Connection not Established");
          else
        	  System.out.println("Connection  Established");
		}//try
		catch(Exception fnf){
			fnf.printStackTrace();
		}//catch
	}//main

}//class
