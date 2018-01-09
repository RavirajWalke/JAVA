//Solution by super keyword

class SuperVehicle{
  int speed=50;
}

class SuperVar extends SuperVehicle{
  int speed=100;
    
  void display(){
  System.out.println(super.speed);//will print speed of Vehicle now
   System.out.println(speed);
  }
  public static void main(String args[]){
   SuperVar b=new SuperVar();
   b.display();
   
}
} 