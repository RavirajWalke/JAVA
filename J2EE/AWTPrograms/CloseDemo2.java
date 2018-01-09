//Program to create Frame

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class CloseDemo2 extends Frame 
{
	CloseDemo2(String str)
	{
		super(str);
	}
	public static void main(String[] args) {
		CloseDemo df=new CloseDemo("Close the frame window");
		df.setSize(300,300);
		df.setVisible(true);
		df.addWindowListener(new WindowAdapter()
		{
		
	public void windowClosing(WindowEvent e){
	System.exit(0);
	}
  });
 }
}