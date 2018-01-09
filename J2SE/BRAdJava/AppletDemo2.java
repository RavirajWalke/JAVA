import javax.swing.*;
import java.awt.*;
public class AppletDemo2 extends JApplet
{
    private double sum;
    public void init()
    {
        String b=JOptionPane.showInputDialog("enter first number");
        String a=JOptionPane.showInputDialog("enter second number");
        
        double n1=Double.parseDouble(a);
        double n2=Double.parseDouble(b);
        sum=n1+n2;
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("the sum of two numbers is "+sum, 30, 30);
    }
}
