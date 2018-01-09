import java.util.*;
class Demo{
public static void main(String args[]){
int i;
double C[]=new double[10];
double F[]=new double[10];
Scanner s=new Scanner(System.in);
for(i=0;i<10;i++)
{
System.out.println("enter temperature in farenhite");
F[i]=s.nextDouble();
C[i]=(F[i]-32)/1.8;
}
for(i=0;i<10;i++)
{
System.out.println("temp in F="+F[i]+" C="+C[i]);
}
}
}
