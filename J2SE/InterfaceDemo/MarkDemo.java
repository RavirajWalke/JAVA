class MyDemo implements MarkDemoInterface {
public void show(){
		System.out.println("This is My class");
	}
}
public class MarkDemo {

		public static void main(String[] args) {
         MyDemo obj= new MyDemo();
         obj=null;
       
        System.out.println(obj instanceof MyDemo);
          if (obj instanceof MyDemo) {
           obj.show();
              
		}
		}
	}


