import java.util.Scanner;
public class Peri 
{
    public static void main(String[] args)
    {
        double l,b,r,s1,s2,s3;
        double PR,PC,PT;
        Scanner s=new Scanner(System.in);
        System.out.println("enter length and breadth of Rectangle");
        l=s.nextInt();
        b=s.nextInt();
        System.out.println("perimeter of RECTANGLE"+2*(l+b));
        System.out.println("enter sides of triangle");
        s1=s.nextInt();
        s2=s.nextInt();
        s3=s.nextInt();
        System.out.println("perimeter of triangle"+(s1+s2+s3));
        System.out.println("enter radius of circle");
        r=s.nextDouble();
        System.out.println("perimeter of circle"+2*3.14*r);
        
    }
}
