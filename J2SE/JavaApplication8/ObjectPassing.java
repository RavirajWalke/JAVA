class Aa
{
    int length,width;
    Aa(int x,int y)
    {
        length=x;
        width=y;
    }   
    Aa(){}
        int rectarea(Aa o)
        {
            return (length*width);
        }
        
    }

class ObjectPassing
{
public static void main(String args[])
{
Aa a1=new Aa(10,30);
Aa a=new Aa();
int c=a1.rectarea(a);
System.out.println(c);
}
}