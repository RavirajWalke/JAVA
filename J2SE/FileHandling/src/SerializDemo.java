/**
 *
 * @author Ravi
 */
import java.io.*;
class MyClass
{
    String s;int a;double b;
    MyClass(String s,int a,double b)
    {
        this.s=s;
        this.a=a;
        this.b=b;
    }
}
public class SerializDemo
{
    public static void main(String args[])
    {
        try(ObjectOutputStream oout=new ObjectOutputStream(new FileOutputStream("abc.txt")))
        {
            MyClass m=new MyClass("hi",12,3.444);
            System.out.println(m);
            oout.writeObject(m);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try(ObjectInputStream oin=new ObjectInputStream(new FileInputStream("abc.txt")))
        {
            MyClass m2=(MyClass)oin.readObject();
            System.out.println(m2);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
