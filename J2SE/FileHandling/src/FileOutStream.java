import java.io.*;
public class FileOutStream
{
	public static void main(String args[])
	{
	  int i;
          FileInputStream fin=null;
          FileOutputStream fout=null;
	  try
	  {
	    fin=new FileInputStream("F:\\JAVA\\FileHandling\\abc.txt");
	    fout=new FileOutputStream("F:\\JAVA\\FileHandling\\a1.txt");
	  while((i=fin.read())!=-1)
	  {
	  fout.write((char)i);
	  }
	  }
	  catch(Exception e)
	  {
	  //e.printStackTrace();
	  }
          finally
	  {
	  	try
	  	{
                    if(fin!=null)
	  		fin.close();
                    if(fout!=null)
	  		fout.close();
	  	}
	  	catch(Exception e)
	  	{
	  		//e.printStackTrace;
	  	}
          }
    }      
}