import java.util.*;
public class LinkedListDemo 
{
    public static void main(String args[])
    {
        String [] a={"apple","banana","graphes","mango","guena"};
        String b[]={"orange","watermelon"};
        List<String> list1=new LinkedList<String>();
        for(String x:a)
            list1.add(x);
        List<String> list2=new LinkedList<String>();
        for(String y:b)
            list2.add(y);
        list1.addAll(list2);
        list2=null;
        printl(list1);
        removel(list1,1,3);
        printl(list1);
        reversel(list1);
    }
    private static void printl(List<String> l)
    {
        for(String p : l)
            System.out.printf("%s ",p);
        System.out.println();
    }
    private static void removel(List<String> l,int from,int to)
    {
        l.subList(from, to).clear();
    }
    private static void reversel(List<String> l)
    {
        ListIterator<String> lt=l.listIterator(l.size());
        while(lt.hasPrevious())
            System.out.printf("%s ",lt.previous());
        System.out.println();
    }
}
