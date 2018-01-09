import java.util.*;
public class CopyReverseFillL 
{
    public static void main(String[] args)
    {
        Character [] a={'a','b','c'};
        List<Character> l=Arrays.asList(a);
        System.out.println("List is: ");
        output(l);
        Character [] b=new Character[3];
        List<Character> cl=Arrays.asList(b);
        Collections.copy(cl, l);
        System.out.printf("Copy of List is: \n");
        output(cl);
        System.out.printf("Reverse of a list is: \n");
        Collections.reverse(cl);
        output(cl);
    }
    private static void output(List<Character> tl)
    {
        for(Character x:tl)
            System.out.printf("%s ",x);
        System.out.println();
    }
}
