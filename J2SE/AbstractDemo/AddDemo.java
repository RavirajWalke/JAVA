//AddDemo.java

// Aop – abstract class
abstract  class  Aop
{
abstract  void sum();
abstract void display();
} 
class Isum extends  Aop
{
	void display(){System.out.println("hii");}
int  a,b,c;
//Sum – Derived class
void  sum()
{
a=10;
b=20;
c=a+b;
System.out.println("Int Sum: "+c);
}
} 
//fsum  --  derived class
 class Fsum extends Aop
{	void display(){System.out.println("byee");}

float a,b,c;
 void sum()
{
a=10.75f;
b=20.23f;
c=a+b;
System.out.println("Float Sum: "+c);
}
}  
class  AddDemo
{
public static void main(String args[])
{
	//Aop  ao=new  Aop();  // Invalid because Aop is abstract
 
 Aop ao=new  Isum();  // Indirect object
  ao.sum();
  ao.display();
  ao=new Fsum();// Indirect object
  ao.sum();
  ao.display();
  
}
}