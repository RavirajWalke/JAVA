/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi
 */
import java.io.*;
public class FileCopyTWR
{
    public static void main(String args[])
    {
        int i;
        try(FileInputStream fin=new FileInputStream("F:\\JAVA\\FileHandling\\abc.txt");
                FileOutputStream fout=new FileOutputStream("F:\\JAVA\\FileHandling\\a1.txt"))
        {
            while((i=fin.read())!=-1)
            {
                fout.write(i);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
