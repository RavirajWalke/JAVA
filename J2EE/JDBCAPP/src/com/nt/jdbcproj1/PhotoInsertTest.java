//JDBC app to insert photo into database table(WORKING WITH LARGE OBJ(BLOB))
package com.nt.jdbcproj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PhotoInsertTest {

	public static void main(String[] args) {
		Scanner sc=null;
		sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement ps=null;
		int eid=0,result=0;
		String ename=null,path=null,query=null;
		float sal=0.0f;
		File file=null;
		InputStream in=null;
		
try{
	
	if(sc!=null)
	{ 
		System.out.println("Enter the eid");
		eid=sc.nextInt();
		System.out.println("Enter the Ename");
	    ename=sc.next();
		System.out.println("Enter the Salary");
		sal=sc.nextFloat();
		System.out.println("Enter the photo path");
		path=sc.nextLine();
	       }//if
	file= new File(path);
	if(file!=null)
		in=new FileInputStream(file);
    //register the driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//Establish the connection
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Shahuraj");
    query="INSERT INTO EMP2 VALUES(?,?,?,?)";
    
	//create PreparedStetement object
    if(con!=null)
    	ps=con.prepareStatement(query);
    if(ps!=null){
    ps.setInt(1,eid);
    ps.setString(2,ename);
    ps.setFloat(3, sal);
    ps.setBinaryStream(4,in,file.length() );
    }//if
    if(ps!=null)
         result=ps.executeUpdate(); 
    if(result==0)
    	System.out.println("Records not Inserted");
    else
    	System.out.println("Records  Inserted");    
      }//try
catch(SQLException se)
{
 se.printStackTrace();
}//catch
catch(ClassNotFoundException cnf)
{
 cnf.printStackTrace();
}//catch
catch(FileNotFoundException fnf)
 {
	fnf.printStackTrace();
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
