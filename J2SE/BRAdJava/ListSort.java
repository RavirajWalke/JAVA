import java.util.*;
public class ListSort
{
    public static void main(String args[])
    {
        String[] a={"ravi","pruthvi","avi"};
        List<String> l1=Arrays.asList(a);
        Collections.sort(l1);
        System.out.printf("%s\n",l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.printf("%s\n",l1);

    }
}
