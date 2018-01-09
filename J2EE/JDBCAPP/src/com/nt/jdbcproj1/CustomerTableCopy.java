//JDBC App to copy the contents of customer table from mySql db to oracle db
package com.nt.jdbcproj1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CustomerTableCopy {
  private static final String GET_DETAILS="SELECT CID,CNAME,CADDRS FROM CUSTOMER";
  private static final String INSERT_DETAILS="INSERT INTO CUSTOMER VALUES(?,?,?)";
  public static void main(String[] args) {
		Connection mysqlCon=null;
		Connection oraCon=null;
		Statement st=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int no=0;
		String name=null,addrs=null;
		try{
			//Register the drivers
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("com.mysql.jdbc.Driver");
			//establish the connections
		oraCon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","Shahuraj");
		mysqlCon=DriverManager.getConnection("jdbc:mysql:///ntaj94db", "root","Shahuraj");
		    //create the statements objs
		if(mysqlCon!=null)
		st=mysqlCon.createStatement();
		if(st!=null){
			rs=st.executeQuery(GET_DETAILS);
             		}//if
		if(oraCon!=null)
			ps=oraCon.prepareStatement(INSERT_DETAILS);
		if(rs!=null){
			while(rs.next()){
				no=rs.getInt(1);
				name=rs.getString(2);
				addrs=rs.getString(3);
				//create prepared statement obj
				
				if(ps!=null){
                    ps.setInt(1, no);
					ps.setString(2, name);
					ps.setString(3,addrs);
					ps.executeUpdate();
				   }//if
		    	}//while
	     	}//if
		System.out.println("Records Copied Succesfully");
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
				if(ps!=null)
				ps.close();
			}
			catch(SQLException se)
			{
			 se.printStackTrace();
			}//catch
			try{
				if(mysqlCon!=null)
					mysqlCon.close();
			}
			catch(SQLException se)
			{
			 se.printStackTrace();
			}//catch
			try{
				if(oraCon!=null)
				oraCon.close();
			}
			catch(SQLException se)
			{
			 se.printStackTrace();
			}//catch

		}//finally
			

  }//main

}//class
