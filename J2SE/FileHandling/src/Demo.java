import java.io.*;
class CopyFileDemo
{
    public static void main(String args[])
    {
        int i;
        try(FileInputStream fin=new FileInputStream("F:\\JAVA\\FileHandling\\abc.txt");
                FileOutputStream fout=new FileOutputStream("F:\\JAVA\\FileHandling\\abcx.txt"))
        {
            while((i=fin.read())!=-1)
            {
                fout.write(i);
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}