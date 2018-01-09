/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT_Swing;

import java.awt.event.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.Box;


/**
 *
 * @author Ravi
 */
public class MyFrameDemo1 extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField tf1,tf2,tf3;
    Button b1,b2;
    MyFrameDemo1()
    {
        l1=new Label("Enter First Number");
        l2=new Label("Enter Second Number");
        l3=new Label("Result");
        tf1=new TextField(20);
        tf2=new TextField(20);
        tf3=new TextField(20);
        b1=new Button("Add");
        b2=new Button("Clear");
        Box b[]=new Box[7];
        for(int i=0;i<7;i++)
        {
            b[i]=Box.createHorizontalBox();
        }
        Box lay=Box.createVerticalBox();
        b[0].add(l1);
        b[1].add(tf1);
        
        b[2].add(l2);
        b[3].add(tf2);
        
        b[4].add(l3);
        b[5].add(tf3);
        
        b[6].add(b1);b[6].add(b2);
        for(int i=0;i<7;i++)
            lay.add(b[i]);
        this.add(lay);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter()
        {
           public void windowClosing(WindowEvent we)
           {
               System.exit(0);
           }
        });
        setFont(new Font("Arial",Font.BOLD,24));
        setBackground(Color.CYAN);
        setForeground(Color.BLUE);
        
        setLayout(new FlowLayout());
        setTitle("Addition");
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        if(str.equals("Add"))
        {
            String s1=tf1.getText();
            String s2=tf2.getText();
            int num1=Integer.parseInt(s1);
            int num2=Integer.parseInt(s2);
            int sum=num1+num2;
            tf3.setText(""+sum);
        }
        else
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
    }
    public static void main(String args[])
    {
        MyFrameDemo1 fr=new MyFrameDemo1();
    }
}
