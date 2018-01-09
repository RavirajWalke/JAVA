import java.lang.Math;
public class Pattern1 {
    public static void main(String args[])
    {
        int i,j,sp=25,k;
        for(i=0;i<=7;i++)
        {
           for(j=0;j<sp;j++)
              System.out.print(" ");
           sp=sp-3;
            for(j=0;j<=i;j++)
               System.out.printf(" %3d",(int)(Math.pow(2,j)));
            for(j=(i-1);j>=0;j--)
               System.out.printf(" %3d",(int)(Math.pow(2,j)));
         System.out.print("\n");
    }
    }   
}
