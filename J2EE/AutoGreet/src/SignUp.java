
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi
 */
public class SignUp extends JFrame
{
    JLabel LDOB;
    private JTextField txt_Name,txt_Email,txt_User,txt_Mob;
    ButtonGroup grp;
    private JPasswordField pass,repass;
    JRadioButton rdo_male,rdo_female;
    JComboBox<Integer> cbox_d,cbox_y;
    JComboBox<String> cbox_m;
    SignUp()
    {
        initComp();
        addComp();
        Container c=this.getContentPane();
	c.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
	this.setVisible(true);
	this.setSize(500, 350);
	this.setTitle("SignUp");
	this.setResizable(false);
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComp()
    {
        txt_Name=new JTextField("Name",25);
        txt_Email=new JTextField("Email",25);
        txt_User=new JTextField("UserName",25);
        pass=new JPasswordField(15);
        repass=new JPasswordField(15);
        txt_Mob=new JTextField("Phone",10);
        Integer[] days=new Integer[31];
	for (int i=1;i<=31 ;i++ ) 
	   days[i-1]=i;
	String[] months={"January","February","March","April","June","July","August","September","October","November","December"};
	Integer[] year =new Integer[100];
	for (int i=0;i<100 ;i++ ) 
            year[i]=i+1951;
        cbox_d=new JComboBox<Integer>(days);
	cbox_m=new JComboBox<String>(months);
	cbox_y=new JComboBox<Integer>(year);
        
        rdo_male=new JRadioButton("Male");
        rdo_female=new JRadioButton("Female");
        grp=new ButtonGroup();
        grp.add(rdo_male);
        grp.add(rdo_female);
        LDOB=new JLabel("Birthday");
    }

    private void addComp()
    {
        Box b[]=new Box[9];
        for(int i=0;i<9;i++)
           b[i]=Box.createHorizontalBox();
        Box lay=Box.createVerticalBox();
        b[0].add(txt_Name);
        b[1].add(txt_Email);
        b[2].add(txt_Mob);
        b[3].add(txt_User);
        b[4].add(pass);
        b[5].add(repass);
        b[6].add(LDOB);
        b[7].add(cbox_d);
        b[7].add(cbox_m);
        b[7].add(cbox_y);
        b[8].add(rdo_male);
        b[8].add(rdo_female);
        for(int i=0;i<9;i++)
            lay.add(b[i]);
        this.add(lay);
    }
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new SignUp();
            }
        });
        
    }
}
