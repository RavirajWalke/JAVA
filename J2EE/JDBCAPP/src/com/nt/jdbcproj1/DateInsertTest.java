//JDBC APP TO INSERT THE record in the table with date values 
package com.nt.jdbcproj1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateInsertTest {
public static void main(String[] args) {
	Scanner sc=null;
	Connection con=null;
	SimpleDateFormat sdf=null;
	java.util.Date ud=null;
	PreparedStatement ps=null;
	java.sql.Date sqd1=null,sqd2=null;
	
	int pid=0,result=0;
	long ms=0;
	String pname=null,dob=null,doj=null;
	
	//take inputs from the end user
	sc=new Scanner(System.in);
  
	try{
		if(sc!=null){
	
	System.out.println("Enter the person ID");
	pid=sc.nextInt();
	System.out.println("Enter the person Name");
	pname=sc.next();
	System.out.println("Enter date of birth(dd-MM-yy)");
	dob=sc.next();
	System.out.println("Enter date of join(yyyy-MM-dd)");
	doj=sc.next();
   }//if
   //convert given dob String to java.util.Date obj 
   sdf=new SimpleDateFormat("dd-mm-yy");
   if(sdf!=null)
	   ud=sdf.parse(dob);
   ms=ud.getTime();
 //convert given  java.util.Date obj to java.sql.Date obj
  sqd1=new java.sql.Date(ms);
  sqd2=java.sql.Date.valueOf(doj);
  //register the jdbc driver 
  Class.forName("oracle.jdbc.driver.OracleDriver");
//Establish the connection
  con=DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:XE","system","Shahuraj");
  //con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Shahuraj");
//Create prepareStetement obj
  if(con!=null)
	  ps=con.prepareStatement("INSERT INTO PERSON_TAB VALUES(?,?,?,?)");
  if(ps!=null){
	  ps.setInt(1,pid);
	  ps.setString(2, pname);
	  ps.setDate(3,sqd1);
	  ps.setDate(4,sqd2);
  }//if
if(ps!=null)
	result=ps.executeUpdate();
if(result==0)
	System.out.println("Records not inserted");
else
	System.out.println("Records inserted");
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
			if(ps!=null)
			ps.close();
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
