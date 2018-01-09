/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Ravi
 */
public class Login extends JFrame
{
    private JButton BLogIn,BSignUp,LogInB;
    private JLabel LLog,LPass;
    private JTextField txt_user;
    private JPasswordField pass;
    private  JLabel headLabel;
    public Login()
    {
        initComponents();
        addComponents();
        Container c=this.getContentPane();
	c.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
        setTitle("Login  Page");
        setSize(500,500);
        setResizable(false);
        setVisible(true);
        setBackground(Color.CYAN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        BSignUp.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new SignUp();
            }
        });
        
    }
    public void initComponents()
    {
        LLog=new JLabel("User Name ");
        LPass=new JLabel("Password  ");
        txt_user=new JTextField(20);
        pass=new JPasswordField(20);
        BLogIn=new JButton("Log In");
        BSignUp=new JButton("Sign Up");
        LogInB=new JButton("Log In");
        headLabel=new JLabel("Automatic Greetiings Sender");
        headLabel.setFont(new Font("Arial",Font.BOLD,24));
        headLabel.setForeground(Color.green);
        
    }
    public void addComponents()
    {
        Box b[]=new Box[5];
        for(int i=0;i<5;i++)
        {
            b[i]=Box.createHorizontalBox();
        }
        Box lay=Box.createVerticalBox();
        
        b[0].add(headLabel);
        b[1].add(BLogIn);
        b[1].add(BSignUp);
        b[2].add(LLog);
        b[2].add(txt_user);
        b[3].add(LPass);
        b[3].add(pass);
        b[4].add(LogInB);
        
        for(int i=0;i<5;i++)
        {
            lay.add(b[i]);
        }
        this.add(lay);
}
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Login();
            }
        });
        
    }

    /*public void actionPerformed(ActionEvent ae) {
       String str=ae.getActionCommand();
       if(str.equals("LogIn"))
       {
           addComponents();
       }
       else
       {
           new SignUp();
       }
    }*/
}
