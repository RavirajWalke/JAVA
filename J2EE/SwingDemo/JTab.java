import java.awt.Container;
import javax.swing.*;

import java.awt.*;

public class JTab extends JFrame {

	JTab(){
		Container c =getContentPane();
		JTabbedPane jt=new JTabbedPane();
		jt.addTab("Sports", new sports());
		//adding tab to JTabbedPane
		jt.addTab("FighterJet", new fighterjet());
		c.add(jt);
	}
	public static void main(String[] args) {
        JTab j=new JTab();
        j.setTitle("Adding table");
		j.setSize(300,300);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class sports extends JPanel{
	sports(){
		JRadioButton rb=new JRadioButton("Hockey");
		JRadioButton rb1=new JRadioButton("Football");
		add(rb);
		add(rb1);
		
	}
}
class fighterjet extends JPanel{
	fighterjet(){
		JCheckBox cb =new JCheckBox("Sukhoi Su-30MKI");
		JCheckBox cb1 =new JCheckBox("HAL Tejas");
		add(cb);
		add(cb1);
	}
}