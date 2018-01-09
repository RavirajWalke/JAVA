class Vehicle_1{
public void strat(){
System.out.println("Starting a Vehicle");
}}
class Car12 extends Vehicle_1{
public void drive(){
System.out.println("Driving a Car");
}
}
class Aircraft12 extends Vehicle_1{
public void fly(){
System.out.println("Flying a plane");
}
}
public class HierInheri {
public static void main(String[] args) {
     Car12 c=new Car12();
     c.strat();
     c.drive();
    
     System.out.println();
     Aircraft12 j= new Aircraft12();
     j.strat();
     j.fly();
     
}
}

