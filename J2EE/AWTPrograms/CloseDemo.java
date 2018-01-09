//Program to create Frame

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class CloseDemo extends Frame {
	CloseDemo(String str){
		super(str);
	}
	public static void main(String[] args) {
		CloseDemo df=new CloseDemo("Close the frame window");
		df.setSize(300,300);
		df.setVisible(true);
		df.addWindowListener(new Demo());
		
		}
}
class Demo extends WindowAdapter{
	public void windowClosing(WindowEvent e){
	System.exit(0);
	}
}