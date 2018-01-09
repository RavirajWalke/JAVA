// Demonstrate indexOf() and lastIndexOf().


import java.io.*;

public class IndexOfDemo {

   public static void main(String args[]) {
      String Str = new String("Welcome to Tutorialspoint.com");
      String SubStr1 = new String("Tutorials");
      String SubStr2 = new String("Sutorials");

      System.out.print("Found Index :" );
      System.out.println(Str.indexOf( 'o' ));
      System.out.print("Found Index :" );
      System.out.println(Str.indexOf( 'o', 5 ));
      System.out.print("Found Index :" );
      System.out.println( Str.indexOf( SubStr1 ));
      System.out.print("Found Index :" );
      System.out.println( Str.indexOf( SubStr1,15 ));
      System.out.print("Found Index :" );
      System.out.println(Str.indexOf( SubStr2 ));
   }
}



























































/*class IndexOfDemo {
public static void main(String args[]) {
String s = "Now is the time for all good men " +
"to come to the aid of their country.";
System.out.println(s);
System.out.println("indexOf(t) = " +
s.indexOf('t'));
System.out.println("lastIndexOf(t) = " +
s.lastIndexOf('t'));
System.out.println("indexOf(the) = " +
s.indexOf("the"));
System.out.println("lastIndexOf(the) = " +
s.lastIndexOf("the"));
System.out.println("indexOf(t, 2) = " +
s.indexOf('t', 2));
System.out.println("lastIndexOf(t, 60) = " +
s.lastIndexOf('t', 60));
System.out.println("indexOf(the, 10) = " +
s.indexOf("the", 10));
System.out.println("lastIndexOf(the, 60) = " +
s.lastIndexOf("the", 60));
}
}*/