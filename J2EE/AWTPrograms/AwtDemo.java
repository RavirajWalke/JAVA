//Program to create Frame

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class AwtDemo extends Frame 
{
	AwtDemo(String str)
	{
		super(str);
		//Create Button
	    this.setLayout(null);
	   	Button b1= new Button("Save");
		b1.setBounds(100,150,70,40);
		this.add(b1);
		

		addWindowListener(new WindowAdapter()
		{
		
	        public void windowClosing(WindowEvent e){
	            System.exit(0);
	            }
        });

		
}
	public static void main(String[] args) {
		//Create Frame with lable
		AwtDemo df=new AwtDemo("Close the frame window");
		//Set size of Frame
		df.setSize(300,300);
		//Set visiblity of Frame
		df.setVisible(true);
		
 }
}