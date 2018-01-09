/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT_Swing;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Ravi
 */
public class ResizeMe extends Applet
{
    final int inc=25;
    int max=500;
    int min=200;
    Dimension d;
    public void init()
    {
        addMouseListener(new MouseAdapter()
        {
            public void mouseReleased(MouseEvent me)
            {
                int w=(d.width+inc)>max?min:(d.width+inc);
                int h=(d.height+inc)>max?min:(d.height+inc);
                setSize(new Dimension(w,h));
            }
        });
    }
    public void paint(Graphics g)
    {
        d=getSize();
        g.drawLine(0, 0, d.width-1, d.height-1);
        g.drawRect(0, 0, d.width-1, d.height-1);
    }
}
