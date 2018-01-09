//JDBC application to perform CURD operation on the database
package com.nt.jdbcproj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.Scanner;

public class MyMiniProj{
	public static final String SELECT_QRY="SELECT * FROM STUDENT";
	public static final String INSERT_QRY="INSERT INTO STUDENT VALUES(?,?,?)";
	public static final String DELETE_QRY="DELETE FROM STUDENT WHERE SID=?";
	public static final String UPDATE_QRY="UPDATE STUDENT SET SNAME=? where SID=?";
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	Statement st=null;
	PreparedStatement ps1=null,ps2=null,ps3=null;
	ResultSet rs=null; 
	boolean flag=false;
	int no=0,sid=0,result=0,result1=0,result2=0;
	String sname=null,sname1=null,add=null,cname=null;
	
    	MyMiniProj() throws Exception{
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Shahuraj"); 
    	this.selectOption();
    	}//constructor
    
    void selectOption() throws Exception{
    	System.out.println("plz select the operation theat u wanna perform:\n1:VIEW\n2:Insert\n3:DELETE\n4:UPDATE\n5)EXIT");
    	no=sc.nextInt();
    	if(no==1)
        	this.view();	
        else if(no==2)
        	this.insert();
        else if(no==3)
            this.delete(); 
        else if(no==4)
            this.update();
        else
        	this.exit();
    }//selectOption	
   void view() throws Exception{
	   if(con!=null)
		   st=con.createStatement();
	   if(st!=null)
		   rs=st.executeQuery(SELECT_QRY);
	   if(rs!=null)
	   {
		   while(rs.next()){
			   System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
		   flag=true;
		   }//while
		   if(flag==false){
			   System.out.println("No records found");
			   }//if
	         }//if
	   this.selectOption();
        }//view 	
   void insert() throws Exception{
	   System.out.println("Enter the details that u want to insert");
	if(sc!=null)
		System.out.println("Enter SID");
	    sid=sc.nextInt();
	    System.out.println("Enter Student name");
	    sname=sc.next();
	    System.out.println("Enter Student address");
	    add=sc.next();
	 if(con!=null)
    ps1=con.prepareStatement(INSERT_QRY);
	if(ps1!=null)
	ps1.setInt(1, sid);
	ps1.setString(2, sname);
	ps1.setString(3, add);
	if(ps1!=null)
		result=ps1.executeUpdate();
	if(result==0)
		System.out.println("RECORDS NOT INSERTED");
	else
		System.out.println("RECORDS  INSERTED SUCCESFULLY");
	    System.out.println("IF U WANT TO SEE THE INSERTED RECORDS PLZZ SELECT THE VIEW OPTION");
	    this.selectOption();
   
   }//INSERT 	
   void update() throws Exception{
	   System.out.println("we r very sorry to say wecant provide u all operation(u can't update details without names) ");
	   System.out.println("please enter the SID Whose record to be updated");
	   sid=sc.nextInt();
	   System.out.println("please enter the  name to be updated ");
	   sname1=sc.next();
	   if(con!=null)
		   ps3=con.prepareStatement(UPDATE_QRY);
	   ps3.setString(1,sname1);
	   ps3.setInt(2,sid);
	   if(ps3!=null)
		   result1=ps3.executeUpdate();
	   if(result1==0)
		   System.out.println("Records not updated");
	   else
		   System.out.println("Records updated Succesfully");
		  System.out.println("To see the upadated records plz select view option");
		  this.selectOption();
   }//view 	
   void delete() throws Exception{
	System.out.println("ENTER THE STUDENT ID WHOSE RECORDS U WANT TO DELETE");
	sid=sc.nextInt();
	if(con!=null)
	   ps2=con.prepareStatement(DELETE_QRY);
	ps2.setInt(1, sid);
	if(ps2!=null)
		result1=ps2.executeUpdate();
	if(result1==0)
		System.out.println("Records not found to delete");
	else
		System.out.println("Records deleted succefully");
	System.out.println("If u want to confirm select view option");
	this.selectOption();
   }//view 	
   void exit(){ 
	   System.out.println("Thank u for visiting my app");
	  System.exit(0);
          }//exit 


	
	
	
	public static void main(String[] args) throws Exception {
	MyMiniProj mn=new MyMiniProj();
   
	}//main

}//class
