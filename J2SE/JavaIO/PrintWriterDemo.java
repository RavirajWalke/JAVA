import java.io.*;
public class PrintWriterDemo 
{
    public static void main(String args[])
    {
        
        PrintWriter pw=new PrintWriter(System.out,true);
        pw.println("this is a printwriter class");
        int i=34;
        pw.println(i);
        String s="hello";
        pw.println(s);
        
    }
}
