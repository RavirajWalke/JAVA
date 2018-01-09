import java.awt.*;
import java.awt.event.*;
class MenuItemShortcut extends Frame implements ActionListener
{
MenuBar mb;
Menu m;
MenuItem exit;
MenuShortcut s;

    public MenuItemShortcut()
    {
        createAndShowGUI();
    }
    
    private void createAndShowGUI()
    {
        setTitle("Shortcut for MenuItem");
       
        // Create MenuBar, Menu, MenuItem
        mb=new MenuBar();
        m=new Menu("Menu");
        exit=new MenuItem("Exit");
       
        // The shortcut is Ctrl+x
        // Ctrl is automatically added for MenuItem
        s=new MenuShortcut(KeyEvent.VK_X);
       
        // Set the shortuct to exit
        exit.setShortcut(s);
       
        // Add ActionListener
        exit.addActionListener(this);
       
        // Add exit to menu and menu to menubar
        m.add(exit);
        mb.add(m);
       
        // Set menu bar to frame
        setMenuBar(mb);
       
        setSize(400,400);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        // Terminate the program
        System.exit(0);
    }
    
    public static void main(String args[])
    {
        new MenuItemShortcut();
    }
}