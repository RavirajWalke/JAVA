package eventhandling;
/**
 *
 * @author Ravi
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KeyEventDemo extends Applet implements KeyListener
{
    String names[]={"Ravi","Kiran","Krishna","Varad","Sumit","Shahaji","Avinash"};
    String nos[]={"9404330126","9876543210","8545123654","9881524085","9421010848","9527489562","8308906797"};
    int x=20,y=20;
    public void init()
    {
        addKeyListener(this);
        
    }
    public void keyPressed(KeyEvent ke){}
    public void keyTyped(KeyEvent ke)
    {
        char ca=ke.getKeyChar();
        Graphics g=this.getGraphics();
        
        for(int i=0;i<names.length;i++)
        {
            if(names[i].charAt(0)==ca)
            {
                String s=names[i]+" "+nos[i];
                g.drawString(s,x , y);
                y=y+20;
            }
        }
    }
    public void keyReleased(KeyEvent ke){}
}
