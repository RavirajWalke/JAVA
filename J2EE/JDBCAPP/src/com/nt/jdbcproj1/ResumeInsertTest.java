//JDBC app to insert the large object using CLOB Data type
package com.nt.jdbcproj1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ResumeInsertTest {
	private static final String INSERT_QRY="INSERT INTO STUDENTALL VALUES(?,?,?,?)"; 
	
	public static void main(String[] args) {
	Scanner sc=null;
	File file=null;
	Reader reader=null;
    int sid=0;
	String sname=null,addrs=null,path=null;
    int charsRead=0,result=0;
	Connection con=null;
	PreparedStatement ps=null;
	try{
    	sc=new Scanner(System.in);
    	if(sc!=null){
    	System.out.println("Enter Student ID");
    	sid=sc.nextInt();
    	System.out.println("Enter Student Name");
    	sname=sc.next();
    	System.out.println("Enter Student Address");
    	addrs=sc.next();
    	System.out.println("Enter path of the Resume Document ");
    	path=sc.next(); 
    	}//if
    	file=new File(path);
    	reader=new FileReader(file);
    	//register the JDBC driver
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	//establish the connection
    	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "Shahuraj");
    	//create the PreparedStatement
    	if(con!=null)
    		ps=con.prepareStatement(INSERT_QRY);
        if(ps!=null)
        {  
        ps.setInt(1, sid);
        ps.setString(2, sname);
        ps.setString(3, addrs);
        ps.setCharacterStream(4, reader,file.length());
        }//if
        if(ps!=null){ 
        	result=ps.executeUpdate();
        }//if
        if(result==0)
        	System.out.println("records not inserted");
        else

        	System.out.println("records inserted SuccesFully");
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
