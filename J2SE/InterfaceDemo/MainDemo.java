interface car
      {
        int  speed=90;
        public void distance();
      }
      interface bus
     {
       int distance=100;
       public void speed();
     }
      class vehicle  implements car,bus
    {
      public void distance()
     {
      int  distance=speed*100; 
      System.out.println("distance travelled is:"+distance);
     }
       public void speed()
     {
       int speed=distance/100;
       System.out.println("Speed is:"+speed);

     }
    }
       class maindemo
     {
        public static void main(String args[])
      {
        System.out.println("Vehicle");
        vehicle v1=new vehicle();
       v1.distance();
       v1.speed();
      }
      }
