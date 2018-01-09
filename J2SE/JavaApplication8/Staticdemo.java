class StaticVariable
{
	int rollno,regno;
	static String clgname="SGGSIE&T";
	static int age=19;
	String stuname;
	public StaticVariable(int x,int y,String name)
	{
		rollno=x;
		regno=y;
		stuname=name;
		
	}
	void studentinfo()
	{
		System.out.println(rollno+" "+regno+" "+stuname+" "+age+" "+clgname);
	}
	void change()
	{
		clgname="GCE";
		age=20;
	}
}

public class Staticdemo
{
public static void main(String[] args)
{
	StaticVariable obj1=new StaticVariable(13,21,"RAHUL");
	obj1.studentinfo();
	obj1.change();
	StaticVariable obj2=new StaticVariable(1,1,"RAVI");
	obj2.studentinfo();
	StaticVariable obj3=new StaticVariable(14,23,"VARUN");
	obj3.studentinfo();
}
     
}

