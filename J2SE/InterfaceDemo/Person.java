//Program for Interface

interface Person
{  
	int a=40;
void run();  // abstract method
}  
class A implements Person
{  
public void run()
{
System.out.println("Run fast");
}   
public static void main(String args[])
 {  
 A obj = new A();  
 obj.run();  
 }  
}  