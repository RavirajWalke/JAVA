import java.awt.*;
import java.awt.event.*;
class ButtonAction extends Frame
{
Button b1,b2,b3;
Frame thisFrame;
  public ButtonAction()
 {
  // Set the frame properties
 setTitle("Button with ActionListener Demo");
 setSize(400,400);
 setLayout(new FlowLayout());
 setLocationRelativeTo(null);
 setVisible(true);
  // Assign current object
 thisFrame=this;
  // Create buttons
 b1=new Button("Minimize");
 b2=new Button("Maximize/Restore");
 b3=new Button("Exit");
  // Add buttons
 add(b1);
 add(b2);
 add(b3);
  // Add action listeners to buttons
 b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae)
  {
  setState(Frame.ICONIFIED);
  }
 });
  b2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae)
  {
   if(thisFrame.getExtendedState()==Frame.NORMAL)
   setExtendedState(Frame.MAXIMIZED_BOTH);
   else if(thisFrame.getExtendedState()==Frame.MAXIMIZED_BOTH)
   setExtendedState(Frame.NORMAL);
  }
 });
  b3.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae)
  {
  System.exit(0);
  }
 });
 }
 public static void main(String args[])
 {
 new ButtonAction();
 }
}