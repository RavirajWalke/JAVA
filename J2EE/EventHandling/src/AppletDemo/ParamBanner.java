package AppletDemo;

/**
 *
 * @author Ravi
 */
import java.applet.*;
import java.awt.*;

/*

 */
public class ParamBanner extends Applet implements Runnable {

    String msg;
    int state;
    boolean stopFlag;
    Thread t = null;

    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    public void start() {
        msg = "THIS IS MESSAGE";
        if (msg == null) {
            msg = "Message not found";
        }
        msg = " " + msg;
        t = new Thread();
        stopFlag = false;
        t.start();
    }

    public void run() {
        for (;;) {
            try {
                repaint();
                Thread.sleep(100);
                if (stopFlag) {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void paint(Graphics g) {
        char ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 50);
    }
}
