//JDBC App TO GET THE EMPLOYYE DETAILS HAVING MAXIMUM SALARY

package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MinSal {

	public static void main(String[] args) {
           Connection con=null;
           Statement st=null;
           ResultSet rs=null;
           String qry=null;
		try{
			//register the jdbc driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establish the connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Shahuraj");
		//send and execute the sql query in db
		if(con!=null)
			st=con.createStatement();
		qry="SELECT * FROM emp WHERE SAL=(SELECT Min(SAL) FROM emp)";
		if(st!=null)
			rs=st.executeQuery(qry);
		while(rs.next()){
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"  "+rs.getInt(3));
		}//while
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
	}//main

}//class

