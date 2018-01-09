public class IndexOfDemo_String {

   public static void main(String args[]) {
      String Str = new String("Welcome to SGGSIE&T Nanded");
      String SubStr1 = new String("SGGSIE");
      String SubStr2 = new String("Nanded");

      System.out.print("Found Index :" );
      System.out.println(Str.indexOf( 'o' ));
      System.out.print("Found Index :" );
      System.out.println(Str.indexOf( 'G' ));
      System.out.print("Found Index :" );
      System.out.println(Str.indexOf( 'm', 7 ));
      System.out.print("Found Index :" );
      System.out.println( Str.indexOf( SubStr1 ));
      System.out.print("Found Index :" );
      System.out.println( Str.lastIndexOf("n"));
      System.out.print("Found Index :" );
      System.out.println(Str.indexOf( SubStr2 ));

   }
}