import java.util.*;
public class Ad 
{
  public static void main(String args[])
  {
    int n,i,j,k=1;
    System.out.println("enter value of n");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(i=1;i<n;i++)
    {
     for(j=1;j<i;j++)
    {
       System.out.print(" "+k); 
       k++;
    }
    System.out.print("\n");
    }
  }
}

