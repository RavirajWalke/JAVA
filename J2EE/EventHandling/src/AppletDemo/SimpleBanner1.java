package AppletDemo;
/**
 *
 * @author Ravi
 */

import java.applet.*;
import java.awt.*;
public class SimpleBanner1 extends Applet implements Runnable
{
    String msg;
    boolean stopFlag;
    Thread t=null;
    public void init()
    {
        setBackground(Color.pink);
        setForeground(Color.red);
        msg="JAVA IS BE  BEAUTIFUL LANGUAGE ";
    }
    public void start()
    {
        t=new Thread(this);
        stopFlag=false;
        t.start();
    }
    public void run()
    {
        for( ; ; )
        {
            try
            {
                repaint();
                Thread.sleep(100);
                if(stopFlag)
                    break;
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public void stop()
    {
        stopFlag=true;
        t=null;
    }
    public void paint(Graphics g)
    {
        char ch=msg.charAt(0);
        msg=msg.substring(1,msg.length());
        msg+=ch;
        g.drawString(msg, 50, 50);
    }
}