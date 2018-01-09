package AppletDemo;
/**
 *
 * @author Ravi
 */
import java.awt.*;
import java.applet.*;
import java.awt.Color;
public class AppleDemo1 extends Applet
{
    String msg;
    public void init()
    {
        setBackground(Color.magenta);
        setForeground(Color.red);
        msg="inside init --------";
    }
    public void start()
    {
        msg+=" inside start----------";
    }
    public void paint(Graphics g)
    {
        msg+=" inside paint----------";
        g.drawString(msg, 10, 20);
    }
}
