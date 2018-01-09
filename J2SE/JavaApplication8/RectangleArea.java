class Rectangle
{
    int l,b;
    Rectangle(int x,int y)
    {
        l=x;
        b=y;
    }
  int Area()
  {
      return(l*b);
  }
}

public class RectangleArea
{
 public static void main(String args[])
 {
     Rectangle a1=new Rectangle(10,20);
     Rectangle a2=new Rectangle(3,7);
     int area=a1.Area();
     int area1=a2.Area();
     System.out.println("Area= "+area);
     System.out.println("Area= "+area1);
 }
}