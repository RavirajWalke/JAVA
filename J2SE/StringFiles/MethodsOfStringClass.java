public class MethodsOfStringClass{
 public static void main(String args[]){
 
   String s="Sachin";
   String p="TENDULKAR";
   
   //toUpperCase() and toLowerCase()
   System.out.println("******toUpperCase and toLowerCase method*******");

   System.out.println(s.toUpperCase());//SACHIN
   System.out.println(p.toLowerCase());//tendulkar
   System.out.println(s);//Sachin(no change in original)
   
 //trim() removes  white spaces*/
   System.out.println("******Trim method******");
   String a="   Program";
   System.out.println(a.trim());
   
   //startsWith() and endsWith()
   System.out.println("******startsWith and endsWith method******");
   System.out.println(s.startsWith("Sa"));
   System.out.println(s.endsWith("n"));

   //char At()
   System.out.println("******charAt method*****");
   System.out.println(s.charAt(0));
   System.out.println(s.charAt(3));

   
   //Length of string
   System.out.println("******length method*****");
   System.out.println(s.length());
   
 //valueOf()
   System.out.println("******valueOf method*****");
  String t= String.valueOf(p);
  System.out.println(t+10);

 }
}
