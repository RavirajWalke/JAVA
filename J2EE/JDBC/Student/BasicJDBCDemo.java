package Student;

/**
 *
 * @author Ravi
 */
import java.sql.*;
import java.util.*;

public class BasicJDBCDemo {

    public static void main(String args[]) {
        Connection con = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/students";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection with Database Estabilished");
            Statement st = con.createStatement();
            Scanner sc = new Scanner(System.in);
            String Table_Name = null;
            while (true) {
                System.out.println("Enter 1.CREATE TABLE 2.INSERT INTO TABLE 3.SHOW DATA IN TABLE 4.DELETE FROM TABLE 5.UPDATE 6.Exit");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter Table_Name");
                        Table_Name = sc.next();
                        String query1 = "create table " + Table_Name + "(Sid int,Sname varchar(30),Age int)";
                        int i;
                        i = st.executeUpdate(query1);
                        System.out.println("Created table " + Table_Name);
                        System.out.println(i + " rows affected");
                        break;
                    case 2:
                        System.out.println("enter values");

                        System.out.println("Enter id");
                        int id = sc.nextInt();
                        System.out.println("Enter age");
                        int age = sc.nextInt();
                        System.out.println("Enter name");
                        String name = sc.next();
                        String query2 = "insert into " + Table_Name + "(Sid,Sname,Age) values(" + id + ",'" + name + "'," + age + ")";
                        i = st.executeUpdate(query2);
                        System.out.println(+i + " rows affected.");
                        break;
                    case 3:
                        String query3 = "select * from " + Table_Name;
                        ResultSet rs = st.executeQuery(query3);
                        //extract data
                        while (rs.next()) {
                            id = rs.getInt(1);
                            name = rs.getString(2);
                            age = rs.getInt(3);
                            System.out.println(id + " " + name + " " + age);
                        }
                        break;
                    case 4:
                        System.out.println("Enter id to delete");
                        String Sid = sc.next();
                        String query4 = "Delete from " + Table_Name + " where Sid=" + Sid;
                        i = st.executeUpdate(query4);
                        System.out.println(i + " rows affected");
                        break;
                    case 5:
                        String query5 = "update " + Table_Name + " set Sname='Krishna' where Sid=12";
                        i = st.executeUpdate(query5);
                        System.out.println("Updated!");
                        break;
                }
                if (ch == 6) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                con.close();
                System.out.println("Connection Closed");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
