import java.util.*;
public class ListtoArray
{
    public static void main(String[] args)
    {
        String []a={"ravi","avi","sai","rushi","pruthvi"};
        LinkedList<String> list1=new LinkedList<String>(Arrays.asList(a));
        list1.add("anu");
        list1.addFirst("Father");
        list1.addFirst("Mother");
        a=list1.toArray(new String[list1.size()]);
        for(String x:a)
            System.out.printf("%s ",x);
        System.out.println();
    }
}
