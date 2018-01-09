//multilevel inheritance
import java.lang.*;
class vehicle
{
int a=10;
 public void calci1()
{
System.out.println("the 1st no.="+a);
}
}
class car extends vehicle
{
int b=20;
 public void calci2()
{
System.out.println("the 2nd no.="+b);
}
}
class aircraft extends car
{
 public void calci3()
{
int s=a+b;
System.out.println("the sum is="+s);
}
}
class inheritance1
{
public static void main(String args[])
{
aircraft x=new aircraft();
x.calci1();
x.calci2();
x.calci3();
}
}