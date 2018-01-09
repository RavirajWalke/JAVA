import java.applet.*;
import java.awt.*;

public class color extends Applet{
	public void paint(Graphics g){ 
		g.setColor(Color.orange);
		g.fillOval(10,10,50,50);
		g.drawOval(10,10,50,50);
		
		g.setColor(Color.GREEN);
		g.fillOval(60,60,50,50);
		g.drawOval(60,60,50,50);
		
		g.setColor(Color.BLACK);
		g.fillOval(110,110,50,50);
		g.drawOval(110,110,50,50);
		
		g.setColor(Color.BLUE);
		g.fillOval(160,160,50,50);
		g.drawOval(160,160,50,50);
	}}