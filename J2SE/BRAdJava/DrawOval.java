import java.awt.*;
import javax.swing.*;
public class DrawOval extends JPanel
{
    private int d=10;
    public  void PaintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.fillOval(10,10,d,d);
    }
    public void SetD(int nd)
    {
        if(nd>=0)
            d=nd;
        else
            d=10;
        repaint();
    }
    public Dimension getPreferredSize() 
    {
       return new Dimension(200,200); 
    }
    public Dimension getMinimumSize()
    {
        return getPreferredSize();
    }
}
