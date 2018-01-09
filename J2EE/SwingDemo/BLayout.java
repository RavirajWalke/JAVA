import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JButton;


public class BLayout  extends JFrame{

	JButton b1,b2,b3,b4,b5;
	BLayout(){  
   
   this.setLayout(new BorderLayout());   
     b1=new JButton("1");  
     b2=new JButton("2");  
     b3=new JButton("3");  
     b4=new JButton("4");  
     b5=new JButton("5");  
              
    this.add("East",b1);
    this.add("West",b2);
    this.add("North",b3);
    this.add("South",b4);
    this.add("Center",b5);  
  
}  
public static void main(String[] args) {  
	BLayout f=new BLayout();
	f.setTitle("BorderLayout");
	f.setSize(300,300);
	f.setVisible(true);
	f.setDefaultCloseOperation(EXIT_ON_CLOSE);  
}  
} 
