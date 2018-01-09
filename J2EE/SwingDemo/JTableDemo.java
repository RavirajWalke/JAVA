import java.awt.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;
public class JTableDemo extends JFrame{
	JTableDemo(){
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		Object rows[] []={{"Deepa","Testing","A+"},{"Shivli","Developer","O+"}};
		String col[]={"Name", "Designatin","Blood Group"};
		JTable t= new JTable(rows,col);
		JTableHeader th=t.getTableHeader();
		c.add("North",th);
		c.add("Center",t);
		
	}
	
	public static void main(String[] args) {
		JTableDemo jt= new JTableDemo();
		jt.setTitle("Adding table");
		jt.setSize(300,300);
		jt.setVisible(true);
		jt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
