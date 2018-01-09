import java.util.*;
class MyException extends Exception
{
    MyException(String s)
    {
        super (s);
    }
}

public class CustomException 
{
    public static void main(String args[])
    {
        int a,b,c;
        System.out.println("enter value of a and b");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        try{
            c=a-b;
            if(c<0)
                throw new MyException("invalid Substraction");
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}
