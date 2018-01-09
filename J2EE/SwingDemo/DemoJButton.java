import javax.swing.*;
import java.awt.*;
public class DemoJButton extends JFrame {
	
	JButton b1, b2;
	Label lab, lab1,lab2,lab3;
	TextField t1;
	CheckboxGroup cb;
	Checkbox c1, c2, c3, c4;
	DemoJButton(){
		
		this.setLayout(null);
		
		lab3=new Label(" ***** Student Details Form *****");
		lab3.setBounds(60,10,900,40);
		lab3.setFont(new Font("Courier New", Font.BOLD, 25));
		this.add(lab3);
		
		lab=new Label("Name :");
		lab.setBounds(60,60,90,40);
		lab.setFont(new Font("Courier New", Font.BOLD, 15));
		this.add(lab);
		
		lab1=new Label("Branch :");
		lab1.setBounds(60,100,90,40);
		lab1.setFont(new Font("Courier New", Font.BOLD, 15));
		this.add(lab1);
		
		lab2=new Label("Favourite :");
		lab2.setBounds(60,140,90,40);
		lab2.setFont(new Font("Courier New", Font.BOLD, 15));
		this.add(lab2);
		
		t1=new TextField(80);
		t1.setBounds(130,75,120,20);
		this.add(t1);
		
		cb=new CheckboxGroup();
		/* Passing cb object to checkbox class to make it radio button*/
		c1= new Checkbox("IT",cb, true);
		c1.setFont(new Font("Courier New", Font.BOLD, 15));
		c1.setBounds(150, 115, 40, 20);
		/* Passing cb object to checkbox class to make it radio button*/
		c2= new Checkbox("MECH",cb, true);
		c2.setFont(new Font("Courier New", Font.BOLD, 15));
		c2.setBounds(220, 115, 80, 20);
		
		c3= new Checkbox("Sport");
		c3.setBounds(150, 155, 60, 20);
		c3.setFont(new Font("Courier New", Font.BOLD, 15));
		c4= new Checkbox("Art");
		c4.setBounds(220, 155, 70, 20);
		c4.setFont(new Font("Courier New", Font.BOLD, 15));
		
		
		this.add(c1);
		this.add(c2);
		this.add(c3);
		this.add(c4);
		
		b1= new JButton("Submit");
		b1.setMnemonic('S');
		//b1.setMnemonic(0);
		b1.setBounds(80,190,80,30);
		
		b2= new JButton("Reset");
		b2.setMnemonic('R');
		b2.setMnemonic(0);
		b2.setBounds(175,190,80,30);
		this.add(b1);
		this.add(b2);
		
	}
	public static void main(String[] args) {
		DemoJButton b=new DemoJButton();
		b.setTitle("Swing Frame");
		b.setSize(300,300);
		b.setVisible(true);
		b.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
	}
	

}
