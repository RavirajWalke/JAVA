import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class TheWindow extends JFrame
{
    private JSlider slider;
    private  DrawOval mypanel;
    public TheWindow()
    {
        super("the title");
        mypanel=new DrawOval();
        mypanel.setBackground(Color.ORANGE);
        slider=new JSlider(SwingConstants.HORIZONTAL,0,200);
        slider.setMajorTickSpacing(10);
        slider.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e){
                mypanel.SetD(slider.getValue());
                add(slider,BorderLayout.SOUTH);
                add(mypanel,BorderLayout.CENTER);
                
            }
        });
    }
}
