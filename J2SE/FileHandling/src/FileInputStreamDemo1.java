/**
 *
 * @author Ravi
 */
import java.io.*;
import java.util.*;
class FileInputStreamDemo1
{
    public static void main(String[] args)
    {
	int ch;
	try
	{
             FileInputStream fin=new FileInputStream("F:\\JAVA\\FileHandling\\abc.txt");
	     do{
		if((ch=fin.read())!=-1)
                    System.out.print((char)ch);
		}
		while(ch!=-1);
             fin.close();
	}
	catch(Exception e)
	{
            System.out.println(e);
	}
    }
}