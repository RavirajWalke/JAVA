//super with methods

class Person{
void message(){
	System.out.println("welcome");
	}
}
class we extends Person{
 void  message(){
	 super.message();
	 System.out.println("hiii");}
}
class Student16 extends Person{
void message(){
	System.out.println("welcome to java");
	 super.message();
	}
void display(){
	 message();
 }
public static void main(String args[]){
	Student16 s=new Student16();
//Student16 s=new Person();
s.message();
}
}

