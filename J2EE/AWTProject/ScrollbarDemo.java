import java.awt.Color;
import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ScrollbarDemo extends Frame {
Scrollbar  s1,s2;
ScrollbarDemo(){
	this.setLayout(null);
	s1=new Scrollbar(Scrollbar.VERTICAL);
	s1.setBounds(650, 0, 20, 700);
	s2=new Scrollbar(Scrollbar.HORIZONTAL);
	//s1.setSize(20, 20);
	s2.setBounds(0, 700, 1350, 20);
	this.add(s1);
	this.add(s2);
	addWindowListener(new WindowAdapter()
	{
	
        public void windowClosing(WindowEvent e){
            System.exit(0);
            }
    });
}
	
	public static void main(String[] args) {
		ScrollbarDemo s=new ScrollbarDemo();
		s.setSize(350,350);
		s.setTitle("Adding CheckBox and Radio Button");
		s.setVisible(true);
	}

}
