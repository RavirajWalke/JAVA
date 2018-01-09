
package StudentReg;

/**
 *
 * @author Ravi
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Win extends JFrame implements ActionListener{
	JMenuBar bar;
	JMenu menu_student,menu_help;
	JMenuItem item_new,item_search,item_about,item_help;
	JButton btn_close;
	Win(){
		bar=new JMenuBar();
		menu_student=new JMenu("Student");
		menu_help=new JMenu("Help");
		item_new=new JMenuItem("New Student");
		item_search=new JMenuItem("Search Student");
		item_about=new JMenuItem("About");
		item_help=new JMenuItem("Help");
		btn_close=new JButton("Close");
		item_new.addActionListener(this);
		item_search.addActionListener(this);
		item_about.addActionListener(this);
		item_help.addActionListener(this);
		btn_close.addActionListener(this);
		Container c=this.getContentPane();
		c.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setSize(400, 200);
		this.setTitle("Student Registration System");
		this.setJMenuBar(bar);
		bar.add(menu_student);
		bar.add(menu_help);
		menu_student.add(item_new);
		menu_student.add(item_search);
		menu_help.add(item_about);
		menu_help.add(item_help);
		this.add(btn_close); 
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae){
 		String str=ae.getActionCommand();
 		if(str.equals("Close")){
 			this.dispose();
 		}
 		else if(str.equals("New Student")){
 			new New();
 			this.dispose();
 		}
 		else if(str.equals("Search Student")){
 			new Search();
 			this.dispose();
 		}
                else if(str.equals("About")){
 			JFrame aufr=new JFrame("About Us");
                        aufr.setSize(300,300);
                        String msg="This Application is developed by Raviraj Yogiraj Walke.";
                        aufr.add(new TextField(msg));
                        aufr.setVisible(true);
 			this.dispose();
 		}
                else if(str.equals("Help"))
                {
 			JFrame hinfo=new JFrame("Help Information");
                        hinfo.setSize(300,300);
                        String msg="This Application can be used to create a student registration System using Swing.\nYou can register your info here.";
                        hinfo.add(new TextField(msg));
                        hinfo.setVisible(true);
 			this.dispose();
 		}
	}
}

public class StudentReg{
	public static void main(String[] args) {
		new Win();
	}
}
