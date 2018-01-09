import java.sql.*;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Client 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Sending request for connection");
        Socket s = new Socket(InetAddress.getLocalHost(),4567);
        System.out.println("Connection Established");
        Scanner x = new Scanner(s.getInputStream());
        PrintStream psm = new PrintStream(s.getOutputStream());
        String str;
        while((str = x.nextLine())!=null)
        {
            if(str.equals("finish"))
                break;
            System.out.println(str);
        }
        Scanner x2 = new Scanner(System.in);
        System.out.print("Select the index of associated conversion : ");
        int choice = x2.nextInt();
        psm.println(choice);
        System.out.println("Enter amount");
        System.out.print(x.nextLine());
        psm.println(x2.nextInt());
        System.out.println(x.nextLine());
        x2.close();
        x.close();
        psm.close();
        s.close();
    }
}
