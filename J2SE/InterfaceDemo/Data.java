interface Printable{  
void print();  
}  
  
interface Showable{  
void show();  
}  
  
class Data implements Printable,Showable{  
  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
	Data obj = new Data();  
obj.print();  
obj.show();  
 }  
}