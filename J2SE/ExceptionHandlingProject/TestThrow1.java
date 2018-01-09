public class TestThrow1{

   static void validate(int age){
     if(age<18)
      throw new ArithmeticException("Invalid Data");
     else
      System.out.println("welcome to vote");
   }
   
   public static void main(String args[]){
	   try{
      validate(14);}
	   catch(ArithmeticException e){ e.printStackTrace();}
      System.out.println("rest of the code...");
  }
}
