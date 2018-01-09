/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi
 */
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class MouseDemo extends Applet implements MouseListener,MouseMotionListener,KeyListener
{
    String msg=null;
    int x=0,y=0;
    public void init()
    {
       addMouseListener(this);
       addMouseMotionListener(this);
       addKeyListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        x=0;y=10;
        msg="Mouse Clicked";
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        x=0;y=10;
        msg="Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {
        x=0;y=10;
        msg="Mouse Exited";
        repaint();
    }
    public void mousePressed(MouseEvent me)
    {
        x=me.getX();y=me.getY();
        msg="down";repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
        x=me.getX();y=me.getY();
        msg="up";
        repaint();
    }
    public void mouseDragged(MouseEvent me)
    {
        x=me.getX();y=me.getY();
        msg="*";
        showStatus("Dragging mouse at"+x+" ,"+y);
        repaint();
    }
     public void mouseMoved(MouseEvent me)
    {
        x=me.getX();y=me.getY();
        showStatus("Dragging mouse at"+x+" ,"+y);
    }
     public void keyPressed(KeyEvent ke)
     {
         
         showStatus("Key Pressed"+ke.getKeyCode());
     }
     public void keyReleased(KeyEvent ke)
     {
         showStatus("Key Pressed"+ke.getKeyCode());
     }
     public void keyTyped(KeyEvent ke)
     {
         x=20;y=20;
         msg+=ke.getKeyChar();
         showStatus("Key Pressed"+ke.getKeyCode());
         repaint();
     }
     public void paint(Graphics g)
     {
         g.drawString(msg, x, y);
     }
}
