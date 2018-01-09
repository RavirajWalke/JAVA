/**
 *
 * @author Ravi
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class P7 extends Applet implements KeyListener
{
    String names[]={"Ravi","Kiran","Krishna","Varad","Sumit"};
    String nos[]={"9404330126","9876543210","8545123654","9881524085","9421010848"};
    int x=20,y=20;
    public void init()
    {
        addKeyListener(this);
        requestFocus();
    }
    public void keyPressed(KeyEvent ke){}
    public void keyTyped(KeyEvent ke)
    {
        char c=ke.getKeyChar();
        Graphics g=this.getGraphics();
        
        for(int i=0;i<names.length;i++)
        {
            if(names[i].charAt(0)==c)
            {
                String s=names[i]+" "+nos[i];
                g.drawString(s,x , y);
                y=y+10;
            }
        }
    }
    public void keyReleased(KeyEvent ke){}
}
