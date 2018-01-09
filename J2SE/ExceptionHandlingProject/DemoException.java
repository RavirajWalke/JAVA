/*public class DemoException {
	
		public static void main(String[] args) {
        int x=5;
        int y=0;
        int z= x/y;
           
System.out.println("Result of the program is::"  +z);

	}

}*/














public class DemoException {
	static int z;
		public static void main(String[] args) {
        int x=5;
        int y=0;
        
        try{
         z= x/y;
        }
        catch(Exception e){}
System.out.println("Rest of the program will continue");

	}

}
