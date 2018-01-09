//Program to create Frame

import java.awt.Frame;
public class DemoFrame1 extends Frame {
DemoFrame1(String str){
	super(str);
}
	public static void main(String[] args) {
		DemoFrame1 df=new DemoFrame1("This is Frame window");
		df.setSize(300,300);
		df.setVisible(true);
		
	
	}

}
