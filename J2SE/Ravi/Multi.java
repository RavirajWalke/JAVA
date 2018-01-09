interface Father{
double ht=6.2;
 void height();
}
interface Mother{
    double ht=6.0;
    void height();
}
class Child implements Father,Mother{
   public  void height(){
       System.out.println("height of child is "+((Father.ht+Mother.ht)/2));
   }
    {
        
    }
}


public class Multi {
    public static void main(String args[])
    {
    Child a=new Child();
    a.height();
}
}