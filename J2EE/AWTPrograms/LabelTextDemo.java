import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class LabelTextDemo extends Frame {
Label lab;
TextField t1;
Label lab1;
TextArea t;
LabelTextDemo(){
	this.setLayout(null);
	lab=new Label("Username::");
	lab.setBounds(60,60,70,40);

	
	t1=new TextField(80);
	t1.setBounds(130,75,120,20);
	this.add(lab);
	this.add(t1);
	
	
	
	    //Create Drop-Down list
		lab1=new Label("Language:: ");
		lab1.setBounds(60,100,70,60);
		this.add(lab1);
		
		// Drop-Downlist, setForground()
	    Choice ch=new Choice();
		ch.setBounds(140,120,90,60);
		ch.add("Java");
		ch.add(".Net");
		ch.add("HTML5");
		ch.add("CSS");
		ch.add("PHP");
		ch.add("Python");
		ch.add("C++");
		this.add(ch);
		ch.setForeground(Color.GREEN);
		lab1.setForeground(Color.MAGENTA);
		lab1.setFont(new Font("Courier New", Font.ITALIC, 15));
		
		//getItemCount of item
		int a=ch.getItemCount();
		System.out.println(a);
		
		
		// TextArea
		t=new TextArea(2,20);
		t.setBounds(140,220,240, 100);
		this.add(t);
		
		//setForeground()
		
		
		
		
		
		
	addWindowListener(new WindowAdapter()
	{
	
        public void windowClosing(WindowEvent e){
            System.exit(0);
            }
    });

	
}
	public static void main(String[] args) {
LabelTextDemo c=new LabelTextDemo();
c.setSize(350,350);
c.setTitle("Multifunctional Frames");
c.setVisible(true);

	}

}
