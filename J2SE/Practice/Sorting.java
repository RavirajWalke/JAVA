import java.util.*;
public class Sorting {
public static void main(String args[]){
    int a[]=new int[20];
    int t,i,j,n,k=0;
    System.out.println("Enter nunber of elements");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    System.out.println("Enter elements");
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
     } 
    System.out.println("before sorting:");
    for(i=0;i<n;i++)
    {
        System.out.print(" "+a[i]);
    }
    System.out.println(" ");
for(i=0;i<n;i++)
    {
   for( j=1;j<n;j++)
   {
            if(a[i]<a[j])
        {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
   }  
    }
    System.out.println("after  sorting:");
    for(i=0;i<n;i++)
    {
         System.out.print(" "+a[i]);
    }
}    
}
