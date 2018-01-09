interface JavaInterface{
 
  public void sayHello();
  }

public class IntExample implements JavaInterface{
  
  public void sayHello(){
    System.out.println("Hello Visitor !");
  }
 
  public static void main(String args[]){
    //create object of the class
	  IntExample j = new IntExample();
    //invoke sayHello(), declared in IntExample interface.
    j.sayHello();
  }
}