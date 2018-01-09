//jdbc app to get student details based on student address
package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest2 {
 public static void main(String[] args) {
	 Scanner sc=null;
	 String addr=null;
	 Connection con=null;
	 String query=null;
	 Statement st=null;
	 ResultSet rs=null;
	 boolean flag=false;
	 try{
		 sc=new Scanner(System.in);
				 //take address from user
				 System.out.println("Enter the address of student");
		 addr=sc.next();
		 //Register driver
		 Class.forName("oracle.jdbc.OracleDriver");
	     //Establish connection
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Shahuraj");
		 //send and execute SQL query="SELECT * FROM STUDENT WHERE ADDRS='HYD'"
		 query="SELECT * FROM STUDENT WHERE ADDRS='"+addr+"'";
		 //Create Statement
		 if(con!=null)
			 st=con.createStatement();
		 //Execute query
		 rs=st.executeQuery(query);
		 //Gather the result
		 while(rs.next())
		 {
			 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		 flag=true;
		 }//while
		 if(flag==true)
			 System.out.println("Records found");
		 else 
			 System.out.println("Records not found");
		 
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
				if(st!=null)
				st.close();
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
