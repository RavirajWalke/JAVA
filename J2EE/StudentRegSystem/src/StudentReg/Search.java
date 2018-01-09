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
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.sql.*;
import java.util.Vector;
import java.awt.*;
import java.awt.event.*;

public class Search extends JFrame implements ActionListener ,ItemListener{
	JRadioButton rdo_name,rdo_roll;
	JTextField txt_name,txt_roll;
	JButton btn_search,btn_cancel,btn_clear;
	ButtonGroup grp;
	Statement stmt;
	Connection con;
	
	public Search() {
		Container c=this.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,15,15));
		this.setVisible(true);
		this.setSize(500, 350);
		this.setTitle("Search Student");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
                
		grp=new ButtonGroup();
		rdo_name=new JRadioButton("By Name");
		rdo_roll=new JRadioButton("By Roll No.");
		txt_roll=new JTextField(10);
		txt_name=new JTextField(10);
		btn_search=new JButton("Search");
		btn_cancel=new JButton("Cancel");
		btn_clear=new JButton("Clear");
                
		grp.add(rdo_name);
		grp.add(rdo_roll);
		
		txt_name.setEditable(false);
		txt_roll.setEditable(false);
		
		Box[] boxes=new Box[4];
		for(int i=0;i<4;i++){
			boxes[i]=Box.createHorizontalBox();
		}
		Box lay=Box.createVerticalBox();
		
		boxes[0].add(new JLabel("Search By :  "));
		boxes[0].add(rdo_name);
		boxes[0].add(rdo_roll);
		boxes[1].add(new JLabel("Name "));
		boxes[1].add(txt_name);
		boxes[2].add(new JLabel("Roll No. "));
		boxes[2].add(txt_roll);
		boxes[3].add(btn_search);
                boxes[3].add(btn_clear);
		boxes[3].add(btn_cancel);
		for(int i=0;i<4;i++){
			lay.add(boxes[i]);
		}
		this.add(lay);
		
		//Adding listeners to components
		btn_search.addActionListener(this);
                btn_clear.addActionListener(this);
		btn_cancel.addActionListener(this);
		rdo_name.addItemListener(new ItemListener()
                        {
                    @Override
                    public void itemStateChanged(ItemEvent e)
                    {
                        if(rdo_name.isSelected())
                        {
                            txt_name.setEditable(true);
                            txt_roll.setEditable(false);
                        }
                    }
                        });
		rdo_roll.addItemListener(new ItemListener()
                        {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(rdo_roll.isSelected())
                        {
                            txt_roll.setEditable(true);
                            txt_name.setEditable(false);
                        }
                    }
                            
                        });
		
   
		//Setting database
		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "");
			stmt=con.createStatement();
		} catch (SQLException e) {
				e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if (str.equals("Search")) {
			search();
		}
                else if(str.equals("Clear"))
                {
                    txt_name.setText("");
                    txt_roll.setText("");
                    grp.clearSelection();
                }
		else if(str.equals("Cancel")){
			new Win();
			this.dispose();
		}
                
	}

	private void search() {
		ResultSet rs=null;
		boolean flag=false;
		String key="";
		if(rdo_name.isSelected()){
			key=txt_name.getText();
			try {
				rs=stmt.executeQuery("select * from Student where name='"+key+"'");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else if(rdo_roll.isSelected()){
			key=txt_roll.getText();
			try {
				rs=stmt.executeQuery("select * from Student where RegNo='"+key+"'");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		JTable table=null;
		try {
			DefaultTableModel model=buildTableModel(rs);
			if(model!=null)
				table = new JTable(model);
			else
				flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(!flag)
			JOptionPane.showMessageDialog(null,new JScrollPane(table));
		else
			JOptionPane.showMessageDialog(null,"No records found");
	}

	private DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
		ResultSetMetaData metaData=rs.getMetaData();
		Vector<String> columnNames= new Vector<String>();
		int j=metaData.getColumnCount();
		for (int i = 1; i <= j; i++) {
			columnNames.add(metaData.getColumnName(i));
		}
		Vector<Vector<String>> table=new Vector<Vector<String>>();
		
		while(rs.next())
                {
			Vector<String> data=new Vector<String>();
			data.add(""+rs.getString(1));
			for (int i = 2; i <= j; i++){
				data.add(""+rs.getString(i));
			}
			table.add(data);
		}
		if(table.size()!=0)
			return new DefaultTableModel(table,columnNames);
		return null;
			
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		if(ie.getStateChange()==ItemEvent.SELECTED){
			JRadioButton b=(JRadioButton) ie.getSource();
			
		}
		else if(ie.getStateChange()==ItemEvent.DESELECTED){
			//System.out.ie.getSource().toString();
		}
		
	}

}
