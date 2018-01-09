package eventhandling;
/**
 *
 * @author Ravi
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class KeyEventDemo2 extends Applet implements KeyListener
{
    String msg="";
    int x=10,y=20;
    public void init()
    {
        addKeyListener(this);
        setBackground(Color.cyan);
        setForeground(Color.red);
    }
    public void keyPressed(KeyEvent ke)
    {
        showStatus("Key Down");
    }
    public void keyReleased(KeyEvent ke)
    {
        showStatus("Key Up");
    }
    public void keyTyped(KeyEvent ke)
    {
        msg+=ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg, x, y);
    }
}
