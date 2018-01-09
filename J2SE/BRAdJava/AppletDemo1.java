import javax.swing.*;
import java.awt.*;
public class AppletDemo1 extends JApplet
{
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Hi there!", 30,30);
    }
}
