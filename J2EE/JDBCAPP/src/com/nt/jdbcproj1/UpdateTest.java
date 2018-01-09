package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {

	public static void main(String[] args) {
		int eid=0;
		int sal=0;
		Scanner sc=null;
		
		Connection con=null;
		String query=null;
		Statement st=null;
		int result=0;
		try{
			//Take inputs from end user
		sc=new Scanner(System.in);
		
		System.out.println("Enter eid");
		 eid=sc.nextInt();
		 System.out.println("Enter salary to update");
		 sal=sc.nextInt();
		 //Register driver
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 //Establish the connection
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Shahuraj");
		 //send and execute theSQL query="UPDATE EMP SET SAL=200000 WHERE EID=101"
		 query="UPDATE EMP SET SAL="+sal+"WHERE EID="+eid;
		 //create Statement
		 if(con!=null)
			 st=con.createStatement();
		 if(st!=null)
			result=st.executeUpdate(query);
		 if(result==0)
			 System.out.println("No records are updated");
		 else
			 System.out.println(result+"Records are updated");
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
