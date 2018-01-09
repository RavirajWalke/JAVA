import java.util.*;
import java.lang.*;
public class Binary
{
    public static void main(String args[])
    {
       int n,i=0,k;
       int d[]=new int[10];
       System.out.println("enter a number");
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       while(n!=0)
       {
           d[i]=n%2;
           n=n/2;
           i++;
       }
       System.out.print("the binary number is");
       for(k=i;k>=0;k--)
       {
         System.out.print(d[k]);
       }
    }
}