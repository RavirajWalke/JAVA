import java.util.*;
public class Democollection 
{
    public static void main(String args[])
    {
        int i;
        String[] a={"add ","subtract ","multiply ","divide"};
    List<String> op=new ArrayList<String>();
    for(String x:a)
    {
        op.add(x);
    }
    for(i=0;i<op.size();i++)
        System.out.printf("%s",op.get(i));
    String[] b={"subtract ","multiply "};
    List<String> op2=new ArrayList<String>();
    for(String y:b)
    {
        op2.add(y);
    }
        System.out.println();
    editlist(op,op2);
    for(i=0;i<op.size();i++)
        System.out.printf("%s",op.get(i));
    System.out.println();
    }
    public static void editlist(Collection<String>l1,Collection<String>l2)
    {
        Iterator<String> it=l1.iterator();
        while(it.hasNext())
        {
            if(l2.contains(it.next()))
                it.remove();
        }
    }
}
