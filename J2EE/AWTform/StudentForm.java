import java.awt.*;
import java.awt.event.*;

class StudentForm extends Frame{
	Label l1,l2;
	TextField f1;
	Button b1;
	Checkbox c1,c2,c3;
	CheckboxGroup ch;
	Choice y;
	StudentForm(){
		setTitle("Student Information Form	D:29/03/2016");
		setVisible(true);
		setBounds(100,100,500,700);
		setBackground(Color.lightGray);
		setLayout(null);
		
		l1 = new Label("Student Information Form");
		l1.setForeground(Color.red);
		l1.setLocation(75,30);
		l1.setSize(500, 50);
		l1.setFont(new Font("Times new Roman",Font.BOLD,30));
		this.add(l1);
		
		l2 = new Label("Full Name:");
		l2.setLocation(25,60);
		l2.setSize(100,80);
		l1.setFont(new Font("Times new Roman",Font.PLAIN,35));
		this.add(l2);
		
		f1 = new TextField(5);
		f1.setBounds(135,80,275,30);
		f1.setFont(new Font("Times new Roman",Font.PLAIN,20));
		this.add(f1);
		
		l2 = new Label("Gender:");
		l2.setLocation(25,124);
		l2.setSize(100,80);
		l1.setFont(new Font("Times new Roman",Font.PLAIN,35));
		this.add(l2);
		
		ch = new CheckboxGroup();
		c1 = new Checkbox("Male",false,ch);
		c2 = new Checkbox("Female",false,ch);
		c1.setBounds(135,150,100,30);
		c2.setBounds(235,150,100,30);
		this.add(c1);
		this.add(c2);
		
		l2 = new Label("Address:");
		l2.setLocation(25,195);
		l2.setSize(100,80);
		l1.setFont(new Font("Times new Roman",Font.PLAIN,35));
		this.add(l2);
				
		TextArea  tx1 = new TextArea(32,8);
		tx1.setBounds(135,220,275,60);
		tx1.setFont(new Font("Times new Roman",Font.PLAIN,25));
		this.add(tx1);
		
		l2 = new Label("Mobile No:");
		l2.setLocation(25,195);
		l2.setSize(100,80);
		l1.setFont(new Font("Times new Roman",Font.PLAIN,35));
		this.add(l2);
		
		f1 = new TextField(5);
		f1.setBounds(135,220,275,30);
		f1.setFont(new Font("Times new Roman",Font.PLAIN,20));
		this.add(f1);
			
		l2 = new Label("Email ID:");
		l2.setLocation(25,285);
		l2.setSize(100,80);
		l1.setFont(new Font("Times new Roman",Font.PLAIN,35));
		this.add(l2);
		
		f1 = new TextField(5);
		f1.setBounds(135,315,275,30);
		f1.setFont(new Font("Times new Roman",Font.PLAIN,20));
		this.add(f1);
		
		l2 = new Label("Registration No:");
		l2.setLocation(25,373);
		l2.setSize(100,80);
		l1.setFont(new Font("Times new Roman",Font.PLAIN,35));
		this.add(l2);
		
		f1 = new TextField(5);
		f1.setBounds(135,395,275,30);
		f1.setFont(new Font("Times new Roman",Font.PLAIN,20));
		this.add(f1);
		
		l2 = new Label("Year & Branch:");
		l2.setLocation(25,453);
		l2.setSize(100,80);
		l1.setFont(new Font("Times new Roman",Font.PLAIN,35));
		this.add(l2);
		
		y = new Choice();
		y.add("F.Y.");
		y.add("S.Y.");
		y.add("T.Y.");
		y.add("B.Tech.");
		y.setBounds(135,480,150,80);
		this.add(y);
		
		y = new Choice();
		y.add("INFT");
		y.add("INST");
		y.add("CSE");
		y.add("TXT");
		y.add("EXTC");
		y.add("MECH");
		y.add("PROD");
		y.add("CHEM");
		y.add("ELECT");
		y.add("CIVIL");
		y.setBounds(295,480,150,80);
		this.add(y);
		
		b1 = new Button("Submit");
		b1.setBounds(120,540,150,40);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b1.setFont(new Font("Times new Roman",Font.BOLD,22));
		this.add(b1);
		
		b1 = new Button("Reset");
		b1.setBounds(250,540,175,40);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b1.setFont(new Font("Times new Roman",Font.BOLD,22));
		this.add(b1);
	}

	public static void main(String args[]){
		StudentForm  s = new StudentForm();
		s.addWindowListener(new CloseOperation());
	}
}
class CloseOperation extends WindowAdapter{
	public void windowClosing(WindowEvent a){
		System.exit(0);
	}
}