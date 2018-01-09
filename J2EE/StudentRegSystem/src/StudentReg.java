/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi
 */
import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class StudentReg {
    String name,rno,gender,dob,query,searchbn,searchbrn;
    static Connection con=null;
    static Statement st=null;
    static int i;
    JTextField rnofield ;
    JTextField namefield ;
    ButtonGroup group;
    JFrame mainfr=new JFrame("Student Registration System");
    private void initUI()
    {
        JMenuBar menubar = new JMenuBar();
        JMenu stMenu = new JMenu("Student");
        JMenuItem newMi = new JMenuItem("New");
        newMi.addActionListener((ActionEvent ae)->{
            newWindow();
        });
        JMenuItem searchMi = new JMenuItem("Search");
        searchMi.addActionListener((ActionEvent ae)->{
            searchWindow();
            
        });
        stMenu.add(newMi);
        stMenu.add(searchMi);
        menubar.add(stMenu);
        JMenu helpMenu=new JMenu("Help");
     
        JMenuItem auMi = new JMenuItem("About Us");
        
        auMi.addActionListener((ActionEvent ae)->{
            JFrame aufr=new JFrame("About Us");
            aufr.setSize(300,300);
            String msg="This Application is developed by Raviraj Yogiraj Walke.";
            aufr.add(new JLabel(msg));
            //aufr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            aufr.setVisible(true);
        });
        JMenuItem hiMi = new JMenuItem("Help Information");
        hiMi.addActionListener((ActionEvent ae)->{
            JFrame hinfo=new JFrame("Help Information");
            hinfo.setSize(300,300);
            String msg="This Application can be used to create a student registration System using Swing.\nYou can register your info here.";
            hinfo.add(new JLabel(msg));
           // hinfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            hinfo.setVisible(true);
        });
        helpMenu.add(auMi);
        helpMenu.add(hiMi);
        
        menubar.add(helpMenu);

        mainfr.setJMenuBar(menubar);//createMenuBar();
        /*JButton close=new JButton("CLOSE");
        mainfr.add(close);
        close.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                mainfr.setDefaultCloseOperation(EXIT_);rr
                mainfr.dispose();
            }
        });*/
        mainfr.setSize(360, 250);
        mainfr.setLocationRelativeTo(null);
        mainfr.setVisible(true);
        mainfr.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void newWindow()
    {
        JComboBox<Integer> cbox_day,cbox_year;
	JComboBox<String> cbox_month;
        JFrame newfr=new JFrame("Student Information");
             rnofield = new JTextField(10);
             namefield = new JTextField(30);
             group = new ButtonGroup();
            JRadioButton rdo_male = new JRadioButton("Male");
	    JRadioButton rdo_female = new JRadioButton("Female");
            group.add(rdo_male);
            group.add(rdo_female);
            Integer[] days=new Integer[31];
		for (int i=1;i<=31 ;i++ ) 
			days[i-1]=i;
		String[] months={"January","February","March","April","June","July","August","September","October","November","December"};
		Integer[] year =new Integer[100];
		for (int i=0;i<100 ;i++ ) 
			year[i]=i+1951;

            cbox_day=new JComboBox<Integer>(days);
            cbox_month=new JComboBox<String>(months);
            cbox_year=new JComboBox<Integer>(year);
            JButton ins=new JButton("Insert");
            JButton clear=new JButton("Clear");
            JButton close=new JButton("Close");
            Container c=newfr.getContentPane();
            c.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
            Box[] boxes=new Box[5];
		for(int i=0;i<5;i++){
			boxes[i]=Box.createHorizontalBox();
		}
		Box lay=Box.createVerticalBox();
		
		//Adding components to frame
		boxes[0].add(new JLabel("Roll No. "));
		boxes[0].add(rnofield);
                JLabel label1 = new JLabel("Name ");
		boxes[1].add(label1);
		boxes[1].add(namefield);
		boxes[2].add(new JLabel("Gender "));
		boxes[2].add(rdo_male);
		boxes[2].add(rdo_female);
		boxes[3].add(new JLabel("Date of Birth "));
		boxes[3].add(cbox_day);
		boxes[3].add(cbox_month);
		boxes[3].add(cbox_year);
		boxes[4].add(ins);
		boxes[4].add(clear);
		boxes[4].add(close);
		
		for(int i=0;i<5;i++){
			lay.add(boxes[i]);
		}
		newfr.add(lay);
		
            ins.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    rno=rnofield.getText();
                    name=namefield.getText();
                    if(rdo_male.isSelected())
                    {
                        gender="Male";
                    }
                    else if(rdo_female.isSelected())
                    {
                        gender="Female";
                    }
                    else
                    {
                        gender=null;
                    }
                    String dob=""+cbox_day.getSelectedItem()+"/"+cbox_month.getSelectedItem()+"/"+cbox_year.getSelectedItem();
                    query="insert into student values('"+rno+"','"+name+"','"+gender+"','"+dob+"')";
                    try {
                        i=st.executeUpdate(query);
                    } catch (SQLException ex) {
                        Logger.getLogger(StudentReg.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "Student Record Added");
                }
            });
            clear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    clear();
                }
            });
            close.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    newfr.dispose();
                }
            });
            newfr.setSize(600,300);
            newfr.setVisible(true);
    }
    private void clear()
    {
        rnofield.setText("");
        namefield.setText("");
        group.clearSelection();
    }
    private void searchWindow()
    {
        JFrame searchfr=new JFrame("Search Student");
        /*JRadioButton rdo_name=new JRadioButton("By Name");
        JRadioButton rdo_roll=new JRadioButton("By Roll NO");
        ButtonGroup grp=new ButtonGroup();
        grp.add(rdo_name);
	grp.add(rdo_roll);*/
        JTextField snamefield = new JTextField(30);
        JTextField srnofield = new JTextField(10);
        //snamefield.setEditable(false);
	//srnofield.setEditable(false);            /////edit
        JButton searchB=new JButton("SEARCH");
        JButton closeB=new JButton("CLOSE");
        Container c=searchfr.getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
        Box[] boxes=new Box[4];
		for(int i=0;i<5;i++){
			boxes[i]=Box.createHorizontalBox();
		}
		Box lay=Box.createVerticalBox();
		
		/*boxes[0].add(new JLabel("Search By :"));
		boxes[0].add(rdo_name);
		boxes[0].add(rdo_roll);*/
		boxes[0].add(new JLabel("Name :"));
		boxes[0].add(snamefield);
		boxes[1].add(new JLabel("Roll No : "));
		boxes[1].add(srnofield);
		boxes[2].add(searchB);
		boxes[2].add(closeB);
		
		for(int i=0;i<3;i++){
			lay.add(boxes[i]);
		}
		searchfr.add(lay);
		/*rdo_name.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        search=snamefield.getText();
                        snamefield.setEditable(true);
                        srnofield.setEditable(false);
                    }
                });
                rdo_roll.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        search=srnofield.getText();
                        srnofield.setEditable(true);
                        snamefield.setEditable(false);
                    }
                });*/
        searchB.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                searchbn=snamefield.getText();
                searchbrn=srnofield.getText();
                if(searchbrn!=null)
                    query="select * from student where Name='"+searchbrn+"'";
                if(searchbn!=null)
                    query="select * from student where Roll_No='"+searchbn+"'";
                try 
                {
                    
                    ResultSet rs=st.executeQuery(query);
                    while(rs.next())
                    {
                        rno=rs.getString(1);
                        name=rs.getString(2);
                        gender=rs.getString(3);
                        dob=rs.getString(4);
                        String str=rno+"  "+name+"  "+gender+"  "+dob;
                        JLabel info=new JLabel(str);
                        searchfr.add(info);
                        System.out.println(str);
                    }
                    
                } 
                catch (SQLException ex)
                {
                    Logger.getLogger(StudentReg.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        searchfr.add(closeB);
        closeB.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                searchfr.dispose();
            }
        });
        searchfr.setSize(500,400);
        searchfr.setVisible(true);
            
    }
    public static void main(String[] args)
    {   
        try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "");
            st=con.createStatement();
                          
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
            StudentReg st = new StudentReg();
            st.initUI();
    }
}