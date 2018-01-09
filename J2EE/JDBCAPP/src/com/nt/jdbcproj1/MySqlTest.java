package com.nt.jdbcproj1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlTest {

	public static void main(String[] args)throws SQLException {
		
		
				//register jdbc driver
				//Class.forName("com.mysql.jdbc.Driver"); (or)
				//Class.forName("org.gjt.mm.mysql.Driver");
				//Establish the connection
				//Connection con=DriverManager.getConnection("jdbc:mysql:///NtAj112","root", "root"); (or)
				 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ntaj94db","root","Shahuraj");
				// create Statement obj
				Statement st=con.createStatement();
				//execute the Query
				ResultSet rs=st.executeQuery("select * from student");
				//process the ResultSet
				while(rs.next()){
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3));
				}
				System.out.println("con obj class"+con.getClass());
				System.out.println("st obj class"+st.getClass());
				System.out.println("rs obj class"+rs.getClass());
				
				
				
				//close jdbc objs
				rs.close();
				st.close();
				con.close();
			}//main
		}//class



	


