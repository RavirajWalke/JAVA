//A Simple demonstration of abstract.
abstract class A_1 {
	
abstract void callme();

void display(){System.out.println("hiii");}
// concrete methods are still allowed in abstract classes
void callmetoo() {
System.out.println("This is a concrete method.");
}
}
 class B_1 extends A_1 {
void callme() {
System.out.println("B's implementation of callme.");
}
}
class AbstractDemo {
public static void main(String args[]) {
	//A_1 b =new A_1();
B_1 b = new B_1();
b.callme();
b.callmetoo();
b.display();
}
}