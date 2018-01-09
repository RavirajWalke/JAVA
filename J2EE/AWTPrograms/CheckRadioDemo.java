
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class CheckRadioDemo extends Frame{

	Label lab1, lab2;
	CheckboxGroup cb;
	Checkbox c1, c2, c3, c4;
	CheckRadioDemo(){
		this.setLayout(null);
		lab1=new Label("Branch");
		lab1.setBounds(60, 100, 120, 50);
		lab2=new Label("Items");
		lab2.setBounds(60, 140, 100, 50);
		cb=new CheckboxGroup();
		/* Passing cb object to checkbox class to make it radio button*/
		c1= new Checkbox("IT",cb, true);
		c1.setBounds(180, 115, 60, 20);
		/* Passing cb object to checkbox class to make it radio button*/
		c2= new Checkbox("MECH",cb, true);
		c2.setBounds(250, 115, 80, 20);
		
		c3= new Checkbox("Mobile");
		c3.setBounds(170, 155, 70, 20);
		
		c4= new Checkbox("Book");
		c4.setBounds(290, 155, 70, 20);
		
		this.add(lab1);
		this.add(lab2);
		this.add(c1);
		this.add(c2);
		this.add(c3);
		this.add(c4);
		lab1.setFont(new Font("Courier New", Font.BOLD, 25));
		lab2.setFont(new Font("Courier New", Font.BOLD, 25));
		c1.setFont(new Font("Courier New", Font.BOLD, 15));
		c2.setFont(new Font("Courier New", Font.BOLD, 15));
		c3.setFont(new Font("Courier New", Font.BOLD, 15));
		c4.setFont(new Font("Courier New", Font.BOLD, 15));
		
		addWindowListener(new WindowAdapter()
		{
		
	        public void windowClosing(WindowEvent e){
	            System.exit(0);
	            }
	    });
		
	}
	public static void main(String[] args) {
		CheckRadioDemo c=new CheckRadioDemo();
		c.setSize(300,300);
		c.setTitle("Adding CheckBox and Radio Button");
		c.setVisible(true);
		//c.setBackground(Color.LIGHT_GRAY);
		
		

	}

}
