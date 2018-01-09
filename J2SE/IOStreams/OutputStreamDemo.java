//Java Application to create the file by taking text content from the user as inputs
package com.skn.Streams;

import java.io.DataInputStream;

import java.io.FileOutputStream;
import java.io.IOException;


public class OutputStreamDemo {

	public static void main(String[] args){
		DataInputStream din=null;
	     FileOutputStream fout=null;
		char ch;
		try{
			//create DataInputStream obj pointing to the keyboard
			System.out.println("Enter the content till @");
			din=new DataInputStream(System.in);
			//Give file path
			if(din!=null)
		
			//create FileOutputStream obj
			fout=new FileOutputStream("D:\\MyFile\\file1.txt");
			if(fout!=null)
			{
				while((ch=(char)(din.read()))!='@')
					fout.write(ch);
			}//if
			if(fout!=null){ 
				System.out.println("Data inserted into the file");
				}//if
				fout.close();
				din.close();
		}//try
		catch(IOException ioe){
			ioe.printStackTrace();
		}//catch
		catch(Exception e){
			e.printStackTrace();;
		}//catch
		finally{
			try{
				if(fout!=null)
					fout.close();
			}//try
			catch(IOException ioe){
				ioe.printStackTrace();
			}//catch
			try{
				if(din!=null)
					din.close();
			}//try
			catch(IOException ioe){
				ioe.printStackTrace();
			}//catch
		}//finally
	}//main
}//class
	