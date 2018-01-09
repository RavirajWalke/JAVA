/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi
 */
import java.sql.*;
import java.util.*;
public class BasicJDBC
{
    public static void main(String args[])throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
        String query="create table st(Sid int,Sname varchar(10),Age int)";
        Statement st=con.createStatement();
        int i =st.executeUpdate(query);
        System.out.println(i+" rows affected");
    }
}
