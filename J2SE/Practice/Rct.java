import java.util.*;
public class Rct
{
 public static void main(String args[])   
 {
     double x,y,l,b;
     Scanner s=new Scanner(System.in);
    System.out.println("enter length and breadth of rectangle");
     l=s.nextDouble();
     b=s.nextDouble();
     System.out.println("enter a point (x,y)");
     x=s.nextDouble();
     y=s.nextDouble();
     if(x>-l/2&&x<l/2&&y>-b/2&&y<b/2)
         System.out.println("point is inside rectangle");
     else if(x==-l/2||x==l/2&&y==-b/2||y==b/2) 
         System.out.println("point is on side of rectangle");
     else 
         System.out.println("point is outside rectangle");
 }
}
