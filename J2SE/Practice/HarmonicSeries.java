import java.util.*;
class HarmonicSeries{
public static void main(String args[]){
int n,i;
double sum=0.0;
System.out.println("enter value of n");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
  sum=sum+1.0/i;
}
System.out.println("sum="+sum);
}
}