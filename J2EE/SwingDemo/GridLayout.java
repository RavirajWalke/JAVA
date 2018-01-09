import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;



public class GridLayout  extends JFrame{

	JButton b1,b2,b3,b4;
	GridLayout(){  
   
	this.setLayout(new java.awt.GridLayout(2,2));
     b1=new JButton("1");  
     b2=new JButton("2");  
     b3=new JButton("3");  
     b4=new JButton("4");  
      
              
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(b4);
     
  
}  
public static void main(String[] args) {  
	GridLayout f=new GridLayout();
	f.setTitle("GridLayout");
	f.setSize(300,300);
	f.setVisible(true);
	f.setDefaultCloseOperation(EXIT_ON_CLOSE);  
}  
} 
