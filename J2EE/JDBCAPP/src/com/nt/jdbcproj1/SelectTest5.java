//JDBC Application to get the student details from student table
package com.nt.jdbcproj1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectTest5 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			
		// Register jdbc driver with driver manager service
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establish connection
	 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","Shahuraj");
		//create jdbc statement object
	 st=con.createStatement();
		//send and execute query
	rs=st.executeQuery("select * from student");
		//process the resultset obj
		while(rs.next()){
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			//rs.next=true;
		}//while
		}//try
		catch(SQLException se){
			System.out.println(se);
		}
		catch(ClassNotFoundException f){
			System.out.println(f);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		//close jdbc obj
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
		catch (Exception e){
		e.printStackTrace();}
		}//finally


	}//main

}//class
