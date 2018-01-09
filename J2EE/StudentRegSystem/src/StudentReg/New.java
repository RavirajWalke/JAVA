/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentReg;

/**
 *
 * @author Ravi
 */
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class New extends JFrame implements ActionListener{
	JTextField text_roll,text_name;
	ButtonGroup grp;
	JRadioButton rdo_male,rdo_female;
	JComboBox<Integer> cbox_d,cbox_y;
	JComboBox<String> cbox_m;
	JButton btn_insert,btn_clear,btn_cancel;
	Connection con;
	PreparedStatement pstmt;
	
	New(){
		Container c=this.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
		this.setVisible(true);
		this.setSize(500, 350);
		this.setTitle("Sign up new Student");
		this.setResizable(false);
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Initializations
		text_roll=new JTextField(10);
		text_name=new JTextField(10);
		rdo_male=new JRadioButton("Male");
		rdo_female=new JRadioButton("Female");
		grp=new ButtonGroup();

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

		btn_insert=new JButton("Insert");
		btn_clear=new JButton("Clear");
		btn_cancel=new JButton("Cancel");

		//Adding items to respective containers
		grp.add(rdo_male);
		grp.add(rdo_female);
		
		//Creating Boxes
		Box[] boxes=new Box[5];
		for(int i=0;i<5;i++){
			boxes[i]=Box.createHorizontalBox();
		}
		Box lay=Box.createVerticalBox();
		
		//Adding components to frame
		JLabel label1 = new JLabel("Name ");
		boxes[0].add(label1);
		boxes[0].add(text_name);
		boxes[1].add(new JLabel("Roll No. "));
		boxes[1].add(text_roll);
		boxes[2].add(new JLabel("Gender "));
		boxes[2].add(rdo_male);
		boxes[2].add(rdo_female);
		boxes[3].add(new JLabel("Date of Birth "));
		boxes[3].add(cbox_d);
		boxes[3].add(cbox_m);
		boxes[3].add(cbox_y);
		boxes[4].add(btn_insert);
		boxes[4].add(btn_clear);
		boxes[4].add(btn_cancel);
		
		for(int i=0;i<5;i++){
			lay.add(boxes[i]);
		}
		this.add(lay);
		
		//Adding listeners
		btn_insert.addActionListener(this);
		btn_clear.addActionListener(this);
		btn_cancel.addActionListener(this);
		
		//Setting database
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "");
			pstmt=con.prepareStatement("insert into Student values(?,?,?,?)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str.equals("Insert"))
                {
				try {
					pstmt.setString(1,text_roll.getText());
					pstmt.setString(2, text_name.getText());
					if(rdo_male.isSelected())
						pstmt.setString(3,"Male");
					else
						pstmt.setString(3, "Female");
					pstmt.setString(4, this.getDate());
					pstmt.executeUpdate();
					JOptionPane.showMessageDialog(null, "Student Record Added");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				clear();
			}
		else if(str.equals("Clear")){
			clear();
		}
		else if(str.equals("Cancel")){
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			new Win();
			this.dispose();
		}
	}
	public void clear() {
		text_name.setText("");
		text_roll.setText("");
		grp.clearSelection();
	}
	private String getDate() {
		return ""+cbox_d.getSelectedItem()+"/"+cbox_m.getSelectedItem()+"/"+cbox_y.getSelectedItem();
	}
}
