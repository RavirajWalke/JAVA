import java.io.*;
public class FileOutStream
{
	public static void main(String args[])
	{
	  int i;
	  try
	  {
	  FileInputStream fin=new FileInputStream("abc.txt");
	  FileOutputStream fout=new FileOutputStream("a1.txt");
	  while((i=fin.read())!=-1)
	  {
	  fout.write((char)i);
	  }
	  }
	  catch(Exception e)
	  {
	  e.printStackTrace();
	  }
	  finally
	  {
	  	try
	  	{
	  		fin.close();
	  		fout.close();
	  	}
	  	catch(Exception e)
	  	{
	  		e.printStackTrace;
	  	}
	  }
	}
}