/**
 *
 * @author Ravi
 */
import java.io.*;
public class FileDemo2
{
    public static void main(String args[])
    {
        try
        {
            int i=0,j;
            FileInputStream fin=new FileInputStream("nums.txt");
            int a[]=new int[10];
            for(i=0;i<10;i++)
            {
                a[i]=fin.read();
            }
            for(i=1;i<10;i++)
            {
               int key=a[i];
               j=i-1;
               while(j>=0&&a[j]>key)
               {
                   a[j+1]=a[j];
                   j=j-1;
               }
               a[j+1]=key;
            }
            for(i=0;i<10;i++)
                System.out.print(a[i]+" ");
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
