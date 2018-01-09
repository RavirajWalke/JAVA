import java.util.*;
public class StringDemo 
{
	public static void main(String args[])
     {
    	 String s1=new String("Raviraj");
         System.out.println(s1.codePointCount(1,4));
    	 String s2=new String("   Raviraj   ");
    	 System.out.println(s1.equals("Kiran"));
    	 System.out.println(s1.equalsIgnoreCase("raviraj"));
    	 int i=s1.compareTo("kiran");
    	 System.out.println(i);
    	 System.out.println(" "+s1.compareTo("raviraj"));
    	 System.out.println(" "+s1.compareToIgnoreCase("RAVIRAJ"));
    	  System.out.println("new string: "+s1.replace('r','a'));
    	  System.out.println("length of s1 "+s1.length());
    	  System.out.println(s1.startsWith("av"));
    	  System.out.println(s1.endsWith("raj"));
    	  System.out.println(s1.charAt(2));
    	 System.out.println(s1.substring(1,4));
    	 System.out.println(s1.substring(4));
    	 System.out.println(s1.indexOf('a',2));
    	 System.out.println(s1.concat(" Walke"));
    	 System.out.println(s1.replaceFirst("Ravi","Avi"));
    	 System.out.println(s1.replaceAll("Raviraj", "Avinash"));
    	 System.out.println(s1.substring(2));
    	 System.out.println(s1.toUpperCase());
    	 System.out.println(s2.trim());
    	}
}
