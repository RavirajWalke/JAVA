import java.util.*;
public class ArraySortDupl {
public static void main(String args[]){
    int a[]=new int[20];
    int t,i,j,n;
    System.out.println("Enter nunber of elements");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    System.out.println("Enter elements");
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
     } 
   /* System.out.println("before sorting:");
    for(i=0;i<n;i++)
    {
        System.out.print(" "+a[i]);
    }
    System.out.println(" ");*/
for(i=0;i<n;i++)
    {
   for( j=i+1;j<n;j++) 
   {
            if(a[i]>a[j])
        {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
   }
    }
   /* System.out.println("after  sorting:");
    for(i=0;i<n;i++)
    {
         System.out.print(" "+a[i]);
    }
    System.out.println("");*/
  System.out.println("after  sorting:");
    for(i=0;i<n;i++)
    {
        if(a[i]==a[i+1])
            continue;
        else
           System.out.print(a[i]+" "); 
    }
}    
}
