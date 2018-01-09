
//Program for Multilevel inheritance with upcasting and downcasting.

class VehicleMy{
	public void strat(){
		System.out.println("Starting a Vehicle");
	}
}
class Van extends VehicleMy{
	public void drive(){
		System.out.println("Driving a Car");
	}
}
class Maruti extends Van{
	public void own(){
		System.out.println("Owing a Maruti");
	}
}
public class MultiInheri {

	public static void main(String[] args) {
     
	
    VehicleMy v= new Van(); //upcasting
    v.strat();
    
   //Van v1=new VehicleMy();
    
    
   Van v1= (Van) v;//Downcating
    v1.strat();
    
   
    
	}

}



