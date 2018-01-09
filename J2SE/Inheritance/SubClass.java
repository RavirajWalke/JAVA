//Referencing Subclass object

class SuperClass{
	String name="Anuja";
	String  desg="Programmer";
	
	public void show(){
		System.out.println("Name:"+name);
		System.out.println("Designation:"+desg);
	}
}
public class SubClass extends SuperClass {
    String address="Mumbai";
    public void show(){
    	System.out.println("City:"+address);
    }
	
public static void main(String[] args) {
SuperClass obj1=new SuperClass();
SubClass obj2=new SubClass();
//System.out.println("Executing SuperClass:");
obj1.show();
//obj2.show();
//obj1=obj2;// Referencing Subclass object
//obj2=obj1;
//obj1.show();
	}

}
