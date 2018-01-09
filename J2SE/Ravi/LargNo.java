import java.util.Scanner;
public class LargNo
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
         int a,b;
        System.out.println("enter value of a");
        a=s.nextInt();
        System.out.println("enter value of b");
        b=s.nextInt();
        int c=a-b;
        int larg=(c>0)?a:b;
        System.out.println("lrgest of two numbers is:"+larg);
    }
}
