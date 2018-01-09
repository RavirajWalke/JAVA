class MySuper11{
	public void msgFromSuper(){
		System.out.println("You are in Superclass");
	}
	
}
class MySuper111 extends MySuper11{
	public void msgFromSuper111(){
		System.out.println("You are in Superclass111");
	}
	
}
public class Test extends MySuper11{
	public void msgFromSub(){
		System.out.println("You are in Sub class");
	}
	
	public static void main(String[] args) {
		
			MySuper11 s=new MySuper11();
			s.msgFromSuper();
			
		//	s.msgFromSub();
			Test c= new Test();
			c.msgFromSuper();
			c.msgFromSub();
	}

}
