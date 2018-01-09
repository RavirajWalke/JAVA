//JDBC app to get the employee details based on the given initial charecters
package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest4 {

	public static void main(String[] args) {
		Scanner sc=null;
		String initChar=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		String qry=null;
		boolean flag=false;
		try{
			sc=new Scanner(System.in);
			// Take the inputs	
			System.out.println("Enter the initial chracters");
			initChar=sc.next();
			//register the jdbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Shahuraj");
	        //create Statement object
			if(con!=null)
			st=con.createStatement();
			//prepare query
			qry="SELECT * FROM EMP WHERE ENAME LIKE '"+initChar+"%'";
			if(st!=null)
				rs=st.executeQuery(qry);
			if(rs!=null){
				while(rs.next()){
					System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"    "+rs.getString(3));
					flag=true;
				}//while
			}//if
			if(flag==false)
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
