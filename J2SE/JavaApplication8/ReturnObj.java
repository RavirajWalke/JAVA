class Circle
{
    int r;
    double area;
    
    Circle(int x,double area)
    {
       r=x;
        this.area=3.14*x*x;
    }
   
    Circle Area()
    {
        Circle c=new Circle(14,3.14*r*r);
        return c;
    }
   
}

public class ReturnObj
{
  public static void main(String args[])
  {
      int r=0;
      Circle a1=new Circle(7,3.14*r*r);
      Circle a2;
      a2=a1.Area();
      System.out.println("when a1.r="+a1.r+" a1.area="+a1.area);
      System.out.println("when a2.r="+a2.r+" a2.area="+a2.area);
     
  }
}
