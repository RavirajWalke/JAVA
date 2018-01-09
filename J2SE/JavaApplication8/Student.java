public class Student
{
   private int stuID;
   private String stuName;
   private int stuAge;

   Student(int idno, String name, int age)
   {
       stuID = idno;
       stuName = name;
       stuAge = age;
   }
    
   int stuID() 
    {
        return stuID; 
    }
   int stuAge()
   {
       return stuAge;
   }

    String StuName() 
    {
       return stuName; 
    }
    
   
  }
  
class StudentInfo
  {
  public static void main(String args[])
  {
    Student a1=new Student(21,"Rahul",19);
    int stuID=a1.stuID();
    System.out.println(stuID);
    String StuName=a1.StuName();
    System.out.println(StuName);
    int stuAge=a1.stuAge();
    System.out.println(stuAge);
   }
}