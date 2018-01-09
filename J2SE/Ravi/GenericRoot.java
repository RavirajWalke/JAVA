import java.util.Scanner;
public class GenericRoot
{
    public static void main(String[] args) 
    {
        int n,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        n=s.nextInt();
       while(n!=0)
       {
           sum=sum+(n%10);
           n=n/10;
       }
       System.out.println("Generic root is :"+sum);
    }
}
