package eventhandling;
/**
 *
 * @author Ravi
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class KeyEventDem2 extends Applet implements KeyListener
{
    String msg="";
    int x=10,y=20,key;
    public void init()
    {
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke)
    {
        key=ke.getKeyCode();
        msg+=key;
        showStatus("Key Down:"+msg);
        
    }
    public void keyReleased(KeyEvent ke)
    {
        showStatus("Key UP");
    }
    public void keyTyped(KeyEvent ke)
    {
        
    }
}
