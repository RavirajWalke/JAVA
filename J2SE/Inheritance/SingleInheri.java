//Program for Single Inheritance
class MySuper{
	public void msgFromSuper(){
		System.out.println("You are in Superclass");
	}
	
}
class MySub extends MySuper{
	public void msgFromSub(){
		System.out.println("You are in Sub class");
	}
}
public class SingleInheri {

	
	public static void main(String[] args) {
		/*MySuper s=new MySuper();
		s.msgFromSuper();
		s.msgFromSub();*/
		
		MySub c= new MySub();
		c.msgFromSuper();
		c.msgFromSub();
		
		
		

	}

}
