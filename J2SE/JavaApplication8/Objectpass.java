class s
{
int i;
	
s(int x)
{
 i=x;
}
	
void  fact(s a1)
{
int fact=1;
while(i!=0)
{
fact=fact*i;
i--;
}
System.out.println(fact);
}
}

public class Objectpass
{
public static void main(String args[])
{
s a1=new s(20);	
a1.fact(a1);
s a2=new s(10);
a2.fact(a1);
}
}
