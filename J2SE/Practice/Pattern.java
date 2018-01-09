import java.util.*;
class Pattern 
{
    public static void main(String args[]){
    int i,j,l,k=1,sp=8;
    Scanner s=new Scanner(System.in);
    for(i=1;i<6;i++)
    {
     for(l=1;l<=sp;l++)
      System.out.print(" ");   
     sp=sp-2;
        for (j=1;j<=i;j++,k++){
          
          System.out.printf("  %2d",k);
         
 
         
        }
        System.out.println("");
    }
   
}
}