import java.util.Scanner;

class Great
{
public static void main(String args[])
{
int a[]=new int[10];
int n,i,j=0;
System.out.println("Enter number of elements");
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("enter elements");
for(i=0;i<=n;i++)
{
a[i]=s.nextInt();
}
System.out.println("the entered elements are");
for(i=0;i<=n;i++)
{
System.out.println(" "+a[i]);
}
int l=a[0];
for(i=0;i<=n;i++)
{
if(a[i]>l)
{
l=a[i];
}
}
System.out.println("the greatest number is "+l);
}
}
