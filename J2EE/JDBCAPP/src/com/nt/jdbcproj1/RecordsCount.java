//JDBC Application to get the no. of records in the table
package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RecordsCount {

	public static void main(String[] args) {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        String qry=null,tname=null;
        Scanner sc=null;
        boolean flag=false;
		try{
			sc=new Scanner(System.in);
			System.out.println("Enter the table name");
			tname=sc.next();
			//register the jdbc driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establish the connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Shahuraj");
		//send and execute the sql query in db
		if(con!=null)
			st=con.createStatement();
		qry="SELECT COUNT(*) FROM "+tname;
		
			rs=st.executeQuery(qry);
		if(rs.next()){
			System.out.println("Total Records="+rs.getInt(1));
				
		}//while
		
		//if
	}//try
   catch(SQLException se){
 	  se.printStackTrace();
   }//catch
		catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}//catch
		catch(Exception e){
			e.printStackTrace();
		}//catch
		finally{
			try{
				if(rs!=null)
				rs.close();
			}//try
			catch (SQLException se){
				se.printStackTrace();
			}//catch
			try{
				if(st!=null)
				st.close();
			}//try
		catch (SQLException se1){
		
		se1.printStackTrace();
		}//catch
			try{
				if(con!=null)
				con.close();
			}//try
		catch (Exception e){
		e.printStackTrace();
		}//catch
		
		}//finally


	}

}
