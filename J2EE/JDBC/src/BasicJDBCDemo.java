
//PROGRAM

package Student;
/**
 *
 * @author Ravi
 */
import java.sql.*;
import java.util.*;

public class BasicJDBCDemo
{
	public static void main(String args[])
	{
		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/students";
			String user="root";
			String pass="2014bcs021";
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connection with Database Estabilished");
			Statement st=con.createStatement();
			Scanner sc=new Scanner(System.in);
			String Table_Name=null;
			while(true)
			{
				System.out.println("Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE");
				int ch=sc.nextInt();
				switch(ch)
				{	
				case 1:
					System.out.println("Enter Table_Name");
					Table_Name=sc.next();
					String query1="create table "+ Table_Name+"(Sid int,Sname varchar(30),Age int)";
					int i;
					i=st.executeUpdate(query1);
					System.out.println("Created table "+Table_Name);
					System.out.println(i+" rows affected");
					break;
				case 2:
						System.out.println("enter values");
					
						System.out.println("Enter id");
						int id=sc.nextInt();
						System.out.println("Enter name");
						String name=sc.next();
						System.out.println("Enter age");
						int age=sc.nextInt();
						String query2="Insert Into "+Table_Name+"(Sid,Sname,Age) Values("+id+",'"+name+"',"+age+")";							i=st.executeUpdate(query2);
						System.out.println(+i+" rows affected.");
						break;
				case 3:
					String query3="select * from "+Table_Name;
					ResultSet rs=st.executeQuery(query3);
					//extract data
					while(rs.next())
					{ 
						id=rs.getInt(1);
						name=rs.getString(2);
					    age=rs.getInt(3);
						System.out.println(id+" "+name+" "+age);
					}
					break;
				case 4:
					System.out.println("Enter id to delete");
					String Sid=sc.next();
					String query4="Delete from "+Table_Name+" where Sid="+Sid;
					i=st.executeUpdate(query4);
					System.out.println(i+" rows affected");
						break;
				case 5:
                    String query5="update "+Table_Name+" set Sname='Krishna' where Sid=15";
                    i=st.executeUpdate(query5);
                    System.out.println("Updated!");
                    break;	
				}
				if(ch==6)
					break;
			}
			con.close();
			System.out.println("Connection Closed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

/***************************************OUTPUT***************************************************************/
/*

run:
Mon Sep 19 05:08:14 IST 2016 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
Connection with Database Estabilished
Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE
1
Enter Table_Name
student
Created table student
0 rows affected
Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE
2
enter values
Enter id
15
Enter name
SHAHAJI
Enter age
19
1 rows affected.
Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE
2
enter values
Enter id
21
Enter name
RAVIRAJ
Enter age
19
1 rows affected.
Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE
2
enter values
Enter id
40
Enter name
SUMIT
Enter age
19
1 rows affected.
Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE
3
15 SHAHAJI 19
21 RAVIRAJ 19
40 SUMIT 19
Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE
2
enter values
Enter id
27
Enter name
KRISHNA
Enter age
20
1 rows affected.
Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE
4
Enter id to delete
27
1 rows affected
Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE
5
Updated!
Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE
3
15 Krishna 19
21 RAVIRAJ 19
40 SUMIT 19
Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE
*/
