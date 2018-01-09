import java.util.Scanner;

// By == operator

class StringComparision{
 public static void main(String args[]){
   String s1="Sachin";
   String s3=new String("Sachin");
   String s2="Sachin";
   String s5=new String("Sachin");
  
   System.out.println(s1==s2);//true (because both refer to same instance)
   System.out.println(s1==s3);//false(because s3 refers to instance created in pool)
   System.out.println(s5==s3);
   System.out.println(s1==s5);
 }
}

