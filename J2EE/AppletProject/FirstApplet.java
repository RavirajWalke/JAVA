import java.applet.*;
import java.awt.*;

public class FirstApplet extends Applet{
	public void paint(Graphics g){  
		g.drawString("Welcome to Java Applet",300,150);  
	
		g.drawLine(20, 50, 90, 70);
		g.drawArc(600, 100, 400, 500,127, 907);
		}  
	
}
