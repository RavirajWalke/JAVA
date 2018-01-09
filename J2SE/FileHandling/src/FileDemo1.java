/**
 *
 * @author Ravi
 */
import java.io.*;
import java.util.*;
public class FileDemo1
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fout=new FileOutputStream("Nums.txt");
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<10;i++)
            {
                int n=sc.nextInt();
                fout.write(n);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
