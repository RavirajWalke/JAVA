import java.util.*;
public class ScannerTest1 
{
    public static void main(String args[])
    {
        String s1="Ravi/9/Raj/52/Avi";
        Scanner s=new Scanner(s1).useDelimiter("/");
        String p="/";
        String s2=s.next();
        int i=s.nextInt();
        String s3=s.next();
        int j=s.nextInt();
        String s4=s.next();
        Integer a=new Integer(i);
        String s5=a.toString();
        String s6=s2.concat(p);
        String s7=s6.concat(s5);
        String s8=s7.concat(p);
        String s9=s8.concat(s3);
        String st1=s9.concat(p);
        String st2=st1.concat(s4);
        System.out.println(st2);
    }
}
