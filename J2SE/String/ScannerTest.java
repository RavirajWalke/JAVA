import java.util.*;
public class ScannerTest 
{
    public static void main(String args[])
    {
        String input="10 pencil 20 pens 30 rubbers";
                Scanner s=new Scanner(input).useDelimiter(" ");
                System.out.println(s.nextInt());
                System.out.println(s.next());
                System.out.println(s.nextInt());
                System.out.println(s.next());
                System.out.println(s.nextInt());
                System.out.println(s.next());
                
                
    }
}
