//Program for Method Overriding

class Vehicle1{
	//float=3.14f;
	public double calculate(){
		double speed,distance,time;
		distance=150;
		time=2.5;
		speed=distance/time;
		return speed;
	}
}
class Car1 extends Vehicle1 {
    public double calculate(){
    	double x;
    	x=super.calculate();
    	System.out.println("Speed of the Vehicle is:"+x+"" +
    			"Kilometer per hour");
		return x;
    }
	public static void main(String[] args) {
Car1 c=new Car1();
c.calculate();
	}

}
