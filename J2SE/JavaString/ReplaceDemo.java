public class ReplaceDemo{
   public static void main(String args[]){
      String Str = new String("Welcome");

      System.out.print("Return Value :" );
 System.out.println(Str.replace("Welcome","Delcome"));

      System.out.print("Return Value :" );
      System.out.println(Str.replace('W', 'D'));
   }
}