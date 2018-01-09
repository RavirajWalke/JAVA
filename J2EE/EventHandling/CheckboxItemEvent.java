import java.awt.*;
import java.awt.event.*;
class CheckboxItemEvent extends Frame
{
Checkbox c;
    public CheckboxItemEvent()
    {
        createAndShowGUI();
    }
    
    private void createAndShowGUI()
    {
        setTitle("Checkbox with ItemListener demo");
        setLayout(new FlowLayout());
        
        // Create simple Checkbox
        c=new Checkbox("Check me");
        
        // Add ItemListener
        c.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie)
            {
                // Change frame title
                setTitle("You "+(c.getState()?"checked":"unchecked")+".");
            }
        });
        
        add(c);
        
        setSize(400,400);
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        new CheckboxItemEvent();
    }
}