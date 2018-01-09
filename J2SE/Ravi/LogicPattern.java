import java.util.Scanner;
public class LogicPattern
{
    public static void main(String[] args)
    {
       int i,j,k,n,l,sp=50;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
       for(i=1;i<n;i++)
       {
           for(l=0;l<sp;l++)
               System.out.print(" ");
           sp=sp-2;          
               k=i;
               for(j=0;j<i;j++)
               {
                   System.out.print(" "+k);
                   k++;
               }
               k=k-2;
               for(l=j-1;l>0;l--,k--)
               {
                   System.out.print(" "+k);
               }
               System.out.println("");
           }
           
       }
    }