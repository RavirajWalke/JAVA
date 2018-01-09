import java.awt.*;
import java.awt.event.*;
class FrameMouseEvent extends Frame implements MouseListener
{
    public FrameMouseEvent()
    {
        createAndShowGUI();
    }
    
    private void createAndShowGUI()
    {
        setTitle("MouseEvent for Frame Demo");
        setSize(400,400);
        setVisible(true);
        
        // Add MouseListener to this frame
        addMouseListener(this);
    }
    
    public void mouseEntered(MouseEvent me)
    {
        setBackground(Color.BLUE);
    }
    
    public void mouseExited(MouseEvent me)
    {
        setBackground(Color.WHITE);
    }
    
    public void mousePressed(MouseEvent me)
    {
        setBackground(Color.GREEN);
    }
    
    public void mouseReleased(MouseEvent me)
    {
        setBackground(Color.magenta);
    }
    
    public void mouseClicked(MouseEvent me)
    {
        setBackground(Color.BLACK);
    }
    
    public static void main(String args[])
    {
        new FrameMouseEvent();
    }
}