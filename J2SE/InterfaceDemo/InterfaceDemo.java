interface Demo {
	
     void call();
     
     
      }
interface Demo1{
         void run();
 }
 class CallTest implements Demo{
    public void call() {
                System.out.println("Hello java");
               
        }
  
}
 class RunTest implements Demo1{
         public void run(){
                 System.out.println("Hello interface");
         }
 }
  public class InterfaceDemo{
         public static void main(String[] args) {
                Demo demo = new CallTest();
                Demo1 demo1 = new RunTest();
              demo.call();
            
              demo1.run();
              
        	 
        }
 }