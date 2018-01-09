// Primitive types are passed by value.
class Test {
void change(int i, int j)
{
    int t;
    t=i;
    i=j;
    j=t;
}
}
class CallByValue {
public static void main(String args[]) {
Test ob = new Test();
int a = 15, b = 20;
System.out.println("a and b before call: " +a + " " + b);
ob.change(a, b);
System.out.println("a and b after call: " +a + " " + b);
}
}