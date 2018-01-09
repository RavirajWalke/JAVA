
abstract class aop1
{

int a=10,b=5,c;
void sum1()
{
//System.out.println("abstract class 1");
}
void sum()
{
System.out.println("abstract class 2");
}
void display(){System.out.println("hiii");}
}

class a extends aop1{
void sum1()
{
System.out.println("abstract class 1");
}

void sum2()
{
c=a+b;
System.out.println("sum is="+c);
}
}
class b extends aop1
{
void sum3()
{
c=a*b;
System.out.println("mul is="+c);
}
}
class abs
{
public static void main(String args[])
{
aop1 x=new a();
x.sum();
x.sum1();
x.display();
/*x.sum1();
x.sum();
x.sum2();
aop y=new b();
y.sum3();*/
}
}




