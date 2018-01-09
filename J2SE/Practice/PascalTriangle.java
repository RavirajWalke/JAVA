import java.util.*;
public class PascalTriangle 
{
    static int fact(int x)
{
int fact=1;
while(x!=0)
{
fact=fact*x;
x--;
}
return (fact);
}
    public static void main(String args[])
    {
    int i,k;
    System.out.println("enter no of rows to print");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(i=0;i<n;i++)
    {
        for(k=0;k<=(n-i-2);k++)
        {
          System.out.print(" ");
        }
        for(k=0;k<=i;k++)
        {
            System.out.printf(" "+fact(i)/(fact(k)*fact(i-k)));
        }
        System.out.println("");
    }
    
    }
}

   
