/*class A{
	final int speedlimit=200;
	void show(){System.out.println(speedlimit);}
}*/

class FinalVar {
  final int speedlimit=90;//final variable
  
  void run(){
    //speedlimit=400;
	  System.out.println(speedlimit);
  }
  
  public static void main(String args[]){
  FinalVar obj=new  FinalVar();
  obj.run();
  //obj.show();
  
  }
 }//end of class
