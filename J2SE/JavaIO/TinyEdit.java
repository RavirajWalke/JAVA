import java.io.*;
public class TinyEdit
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=new String[100];
        int i;
        System.out.println("enter the input lines");
        for( i=0;i<100;i++)
        {
            s[i]=br.readLine();
            if(s[i].equalsIgnoreCase("stop"))
               break; 
        }
        System.out.println("Hereis your file");
        for(i=0;i<100;i++)
        {
            if(s[i].equalsIgnoreCase("stop"))break;
            System.out.println(s[i]);
        }
    }
}
