import java.util.*;
public class QueueDemo
{
    public static void main(String[] args)
    {
        PriorityQueue<String> q=new PriorityQueue<String>();
        q.offer("first");
        System.out.printf("%s ",q);
        System.out.println();
        q.offer("second");
        System.out.printf("%s ",q);
        System.out.println();
        q.offer("third");
        System.out.printf("%s ",q);
        System.out.println();
        q.offer("fourth");
        System.out.printf("%s ",q);
        System.out.println();
        q.poll();
        System.out.printf("%s ",q);
        System.out.println();
        q.poll();
        System.out.printf("%s ",q);
        System.out.println();
    }
}
