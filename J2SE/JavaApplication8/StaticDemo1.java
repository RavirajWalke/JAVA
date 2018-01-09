class StaticDemo1
{  
int rollno;  
String name;  
static String college = "ITS";  
	       
static void change()
{  
college = "BBDIT";  
}  
StaticDemo1(int r, String n)
{  
    rollno = r;  
    name = n;  
}

void display ()
{
    System.out.println(rollno+" "+name+" "+college);
}  
	  
public static void main(String args[])
{  
StaticDemo1 s1 = new StaticDemo1 (111,"Karan");
StaticDemo1.change();   
StaticDemo1 s2 = new StaticDemo1 (222,"Aryan");
StaticDemo1 s3 = new StaticDemo1 (333,"Sonoo");  

s1.display();  
s2.display();  
s3.display();  
}  
}  
