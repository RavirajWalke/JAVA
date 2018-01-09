class One{
    void calculate(double x)
    {
        System.out.println(Math.sqrt(x));
    }
}
class Two extends One{
    void calculate(double x)
    {
        System.out.println(x*x);
        super.calculate(25);
    } 
}

public class p {
    public static void main(String[] args) {
   Two a=new Two();
   a.calculate(25);
}
    
}
