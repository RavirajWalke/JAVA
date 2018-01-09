import java.awt.*;
import java.awt.event.*;
class ButtonComponentEvent extends Frame implements ComponentListener
{
Button main;
Button resize,show,move;

    public ButtonComponentEvent()
    {
        createAndShowGUI();
    }
    
    private void createAndShowGUI()
    {
        setTitle("ComponentEvent on Button");
        setLayout(new FlowLayout());
        
        // Create buttons
        main=new Button("Main Button");
        resize=new Button("Increase size");
        show=new Button("Show/Hide");
        move=new Button("Move down");
        
        // Add ActionListener to buttons
        resize.addActionListener(new ResizeListener());
        show.addActionListener(new ShowListener());
        move.addActionListener(new MoveListener());
        
        // Add ComponentListener to main button
        main.addComponentListener(this);
        
        // Add all buttons
        add(main);
        add(resize);
        add(show);
        add(move);
    
        setSize(400,400);
        setVisible(true);
    }
    
    // For any ComponentEvent, just update the title
    public void componentResized(ComponentEvent ce)
    {
        setTitle("Resized to ["+main.getWidth()+","+main.getHeight()+"]");
    }
    
    public void componentMoved(ComponentEvent ce)
    {
        setTitle("Moved to ["+main.getX()+","+main.getY()+"]");
    }
    
    public void componentShown(ComponentEvent ce)
    {
        setTitle("Button is visible");
    }
    
    public void componentHidden(ComponentEvent ce)
    {
        setTitle("Button is hidden");
    }
    
    public static void main(String args[])
    {
        new ButtonComponentEvent();
    }

    // The listener implementations
    
    class ResizeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            // Increase width,height by 1
            main.setSize(main.getWidth()+1,main.getHeight()+1);
        }
    }

    class ShowListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            // If visible, hide else show
            main.setVisible(!main.isVisible());
        }
    }

    class MoveListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            // Move down 5 units from current location
            main.setLocation(main.getX(),main.getY()+5);
        }
    }

}
