import java.util.*;
public class ExceptionDemo3
{
     public static void main(String args[])
    {
       int a[]={10,20,30,40};
       int b[]={1,0,1,0};
       for(int i=0;i<a.length;i++)
       {
           System.out.printf(" %d",a[i]);
       }
        System.out.println("");
       for(int i=0;i<b.length;i++)
       {
           System.out.printf(" %d",b[i]);
       }
        System.out.println("");
       int c;
       for(int i=0;i<a.length;i++)
       {
           
           try{
            c=a[i]/b[i];
           }
           catch(Exception e)
           {
               continue;
           }
           System.out.printf(" %d",c);
                   
       }
       System.out.println("");
    }
}
   
