import java.util.Scanner  ;
abstract class Employ
{
    public abstract void salary();
    public abstract void display();
}
  class Salary extends Employ{
      double s,n,r,d;
      void getdata(String name,int rn,double n,double r,int d)
      {
          System.out.print("Employ Name: "+name+"\tEmploy number: "+rn);
          this.n=n;
         this.r=r;
         this.d=d;
         System.out.print(" \tno of hrs worked per day: "+n+"\trate per hr: "+r);
      }
   
      public void salary(){
          s=n*r*d;
      }
      public void display()
      {
          System.out.print("\tsalary of Employ: "+s);
      }
  }
public class Google{
    public static void main(String[] args) {
       Salary e1=new Salary();
       e1.getdata("Shubham Patil",25,10,300,300);
       e1.salary();
       e1.display();
        System.out.println("");
       Salary e2=new Salary();
       e2.getdata("Saiprasad Bhandare",26,8,300,300);
       
       e2.salary();
       e2.display();
        System.out.println("");
       Salary e3=new Salary();
       e3.getdata("Shahaji Narwade",27,9,300,290);
       e3.salary();
       e3.display();
        System.out.println("");
    }
}