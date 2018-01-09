import java.util.*;
public class GenericDemo1
{
    public static void main(String[] args) {
        Integer [] a={1,2,3,4,5};
        Character [] b={'a','b','c','d','e'};
        printMe(a);
        System.out.println("");
        printMe(b);
    }
    private static <T> void printMe(T[] x)
    {
        for(T p:x)
            System.out.printf("%s ",p);
    }
}
