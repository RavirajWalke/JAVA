//The this keyword can be used to refer current class instance variable.
//Understanding the problem without this keyword
class Student10{
    int id;
    String name;
    
    Student10(int id,String name){
    id = id;
    name = name;
    }
     /*Student10(int i,String n){
    id = i;
    name = n;
    }*/
     
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
    Student10 s1 = new Student10(111,"Karan");
    Student10 s2 = new Student10(321,"Aryan");
    s1.display();
    s2.display();
    }
}
