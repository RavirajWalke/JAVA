package DBStudents;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCDemo2
{
	public static void main(String args[])
	{
		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/students";
			String user="root";
			String pass="2014bcs021";
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connection Estabilished");
			Statement st=con.createStatement();
			//execute query
			String query="select * from Student";
			ResultSet rs=st.executeQuery(query);
			//extract data
			while(rs.next())
			{
				 
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int age=rs.getInt(3);
				System.out.println(id+" "+name+" "+age);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
