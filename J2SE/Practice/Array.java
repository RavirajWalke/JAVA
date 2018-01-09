import java.util.*;
public class Array
{
    public static void main(String args[])
    {
      int arr[]=new int[100];
      int i,n,j,k;
      System.out.println("Enter no of elements ");
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      System.out.println("Enter elements of array");
      for(i=0;i<n;i++)
          arr[i]=s.nextInt();
      k=arr[0];
      for(i=0;i<n;i++)
      {
      System.out.print(" "+arr[i]);
      }
      for(i=0,j=1;i<n;i++)
      if(arr[i]!=arr[j])
          System.out.print(" "+arr[i]);
      }
    }
    

