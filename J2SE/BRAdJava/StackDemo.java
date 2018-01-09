import java.util.*;
public class StackDemo
{
    public static void main(String[] args) 
    {
        Stack<String> s=new Stack<String>();
        printStack(s);
        s.push("apple");
        printStack(s);
        s.push("banana");
        printStack(s);
        s.push("graphes");
        printStack(s);
        s.pop();
        printStack(s);
        s.pop();
        printStack(s);
    }
    private static void printStack(Stack<String> st)
    {
        if(st.isEmpty())
            System.out.println("null");
        for(String x:st)
            System.out.printf("%s ",x);
        System.out.println();
    }
}
