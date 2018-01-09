import java.io.*;
public class BRReadline
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println("enter strings");
        do{
            s=br.readLine();
            System.out.println(s);
        }
        while(!s.equals("stop"));
    }
}
