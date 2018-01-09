import java.util.*;
public class SetDemo
{
    public static void main(String[] args)
    {
        String s[]={"first","second","third","fourth"};
        List<String> l=Arrays.asList(s);
        System.out.printf("%s",l);
        System.out.println("");
        Set<String> se=new HashSet<String>(l);
        System.out.printf("%s",l);
        System.out.println("");
    }
}
