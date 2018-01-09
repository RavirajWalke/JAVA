//JDBC Application to print the employee datails based on rhe given three designations
package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest6 {
  public static void main(String[] args) {
	Scanner sc=null;
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	String des1=null , des2=null,des3=null;
    String qry=null;	  //take the inputs fronm the enduser
    boolean flag=false; 
    try{
	    sc=new Scanner(System.in);
	  System.out.println("Enter Designation 1");
	  des1=sc.next();
	  des1.toUpperCase();
	  System.out.println("Enter Designation 2");
	  des2=sc.next();
	  des2.toUpperCase();
	  System.out.println("Enter Designation 3");
	  des3=sc.next();
	  des3.toUpperCase();
	  //register the Driver
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  //Establsh the connection
	  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Shahuraj");
	  //prepare the stetement object
	  if(con!=null)
		  st=con.createStatement();
	  //QUERY="sELECT * FROM EMP1 WHERE JOB IN('CLERK',''MANAGER,'SALESMAN')"
	  qry="SELECT * FROM EMP1 WHERE JOB IN ('"+des1+"','"+des2+"','"+des3+"')";
	  if(st!=null)
		  rs=st.executeQuery(qry);
	if(rs!=null){
	  while(rs.next()){
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"   "+rs.getLong(4));
		 flag=true;
		}//while
	   }//if
	if(flag==false){
		System.out.println("No records found");
	}
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
			try{
				if(sc!=null)
				sc.close();
			}
		catch (Exception e){
		
		e.printStackTrace();}
		
		}//finally


}//main
}//class
