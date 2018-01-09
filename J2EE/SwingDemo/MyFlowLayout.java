import java.awt.*;  

import javax.swing.*;  
  
public class MyFlowLayout extends JFrame{  
	JButton b1, b2,b3,b4,b5;
	
    MyFlowLayout(){  
   
   this.setLayout(new FlowLayout(FlowLayout.CENTER));   
     b1=new JButton("1");  
     b2=new JButton("2");  
     b3=new JButton("3");  
     b4=new JButton("4");  
     b5=new JButton("5");  
              
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(b4);
    this.add(b5);  
  
}  
public static void main(String[] args) {  
	MyFlowLayout f=new MyFlowLayout();
	f.setTitle("Flowlayout");
	f.setSize(300,300);
	f.setVisible(true);
	f.setDefaultCloseOperation(EXIT_ON_CLOSE);  
}  
} 