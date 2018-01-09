interface Developer1
{  
void disp();
}  
interface Manager1
{
void show();
} 

class Employee implements Developer1
{
public void disp()
{
System.out.println("Hello Good Morning");  
}
public void show()
{
	
System.out.println("How are you ?");  
}
public static void main(String args[])
{
Developer1 d=new Employee();
d.disp();

	//Manager1 m=new Employee();
//	m.disp();
	//m.show();
Employee obj=new Employee();
obj.disp();
obj.show();
}  
} 