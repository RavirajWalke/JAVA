// Multiple catch block
public class TestMultipleCatchBlock{
  public static void main(String args[]){
   try{
    int a[]=new int[5];
   // a[7]=72;
    a[4]=30/0;
    
      }
   catch(ArithmeticException e){
	   e.printStackTrace();
	   System.out.println("task1 is completed");
	   	   }
   catch(ArrayIndexOutOfBoundsException e){
	   //e.printStackTrace();
	   System.out.println("task 2 completed");
	   }
   catch(Exception e){
	   System.out.println("common task completed");
	   }
   System.out.println("rest of the code...");
 }
}
