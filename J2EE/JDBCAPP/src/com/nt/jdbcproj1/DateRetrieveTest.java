//JDBC APP TO RETRIEVE THE RECOEDS DETAILS WITH THE DATE VALUES
package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class DateRetrieveTest {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int pno=0;
		String pname=null,dob=null,doj=null;
		java.sql.Date jsd1=null,jsd2=null;
		java.util.Date jud1=null,jud2=null;
		SimpleDateFormat sdf=null;
		boolean flag=false;
		try {//register the jdbc driver 
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		//Establish the connection
		  con=DriverManager.getConnection("jdbc:oracle:thin:@localHost:1521:XE","system","Shahuraj");
		  //con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Shahuraj");
		//Create prepareStetement obj
		  if(con!=null)
			  ps=con.prepareStatement("SELECT * FROM PERSON_TAB");
		  if(ps!=null)
			  rs=ps.executeQuery();
		  if(rs!=null){
			  while(rs.next()){
			  pno=rs.getInt(1);
			  pname=rs.getString(2);
			  jsd1=rs.getDate(3);
			  jsd2=rs.getDate(4);
			  jud1=(java.util.Date)jsd1;
			  jud2=(java.util.Date)jsd2;
			  sdf=new SimpleDateFormat("dd-MM-yy");
			  dob=sdf.format(jud1);
			  doj=sdf.format(jud2);
			  System.out.println(pno+"   "+pname+"   "+dob+"   "+doj);
			  flag=true;
			  }//while
			  if(flag==false)
				  System.out.println("No Records are found");
	   }//if
	}//TRY
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
		try{if(rs!=null)
		rs.close();
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
			if(con!=null)
			con.close();
		}
		catch(SQLException se)
		{
		 se.printStackTrace();
		}//catch
		
	}//finally

}//MAIN
}//CLASS
