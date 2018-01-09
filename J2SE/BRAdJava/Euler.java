import java.math.*;
import java.util.*;
public class Euler
{
    public static void main(String[] args) {
        int A,T,i;
        long M;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for(i=0;i<T;i++)
        {
            A=sc.nextInt();
            M=sc.nextLong();
            long Y=(M-1)/2;
            long Z=(long) Math.pow(A,Y);
           // System.out.println(Z);
            if(Z%M==1)
                System.out.println("YES");
            else if(Z%M==(M-1))
                System.out.println("NO");
            
        }
    }
}
