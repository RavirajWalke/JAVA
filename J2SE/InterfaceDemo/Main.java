/*WAP to construct Inner class which access private data 
 from outer class.
1. Create object if inner class using outerclass object.
2. Access method of outer class and inner class with the help of 
inner class object and outer class object.*/


class OuterClass{
	private int x=50;
	
	class InnerClass
	{
		private int ans;
		public void getvalue()
		{
			display();
			System.out.println("Outer class value:"+x);
		}
	}
	public void display()
	{
		System.out.println("Outer class display");
		
	}
	public void accessInner()
	{
		InnerClass obj=new InnerClass();
		obj.ans=200;
		System.out.println("Inner class value is:"+obj.ans);
	}
	
}
public class Main {
	
	public static void main(String[] args) {

    OuterClass outobj=new  OuterClass();
    OuterClass.InnerClass inobj=outobj.new InnerClass();
   // OuterClass.InnerClass inobj=new OuterClass().new InnerClass();
    inobj.getvalue();
    outobj.accessInner();
    outobj.display();
    
	}

}
