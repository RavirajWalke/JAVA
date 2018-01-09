class VehicleMy_1{
public void strat(){
System.out.println("Starting a Vehicle");
}
}
class Van_1 extends VehicleMy_1{
public void drive(){
System.out.println("Driving a Car");
}
}
class Maruti_1 extends Van_1{
public void own(){
System.out.println("Owing a Maruti");
}
}
public class MultiInheiExample {

public static void main(String[] args) {
    //System.out.println("Creating a Car......");
    Maruti_1 m=new Maruti_1();
    m.strat();
    m.drive();
    m.own();
    VehicleMy_1 a = new VehicleMy_1();
    a.strat();
    
}

}

