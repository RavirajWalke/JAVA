/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling;

/**
 *
 * @author Ravi
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseAd extends Applet implements MouseListener {
    int mouseX = 0, mouseY = 0;
    public void init() {
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me) {
        mouseX = me.getX();
        mouseY=me.getY();
        repaint();
    }
    public void mousePressed(MouseEvent me) {

    }

    public void mouseReleased(MouseEvent me) {

    }

    public void mouseEntered(MouseEvent me) {

    }

    public void mouseExited(MouseEvent me) {

    }

    public void paint(Graphics g) {
        int x[] = {mouseX, mouseX - 10, mouseX - 10, mouseX + 10, mouseX + 10,mouseX};
        int y[] = {mouseY, mouseY + 10, mouseY + 20, mouseY + 20, mouseY + 10,mouseY};
        g.drawPolygon(x, y, 5);
    }
}
