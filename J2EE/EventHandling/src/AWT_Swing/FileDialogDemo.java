/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT_Swing;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Ravi
 */
class SampleFrame
{
    private Button browseB;
    SampleFrame()
    {
        Frame f=new Frame();
        f.setTitle("FileDialogDemo");
        f.setSize(100,100);
        f.setVisible(true);
        browseB=new Button("Browse");
        f.add(browseB);
        browseB.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
               FileDialog fd=new FileDialog(f,"File Dialog");
               fd.setVisible(true); 
            }
        });
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        
    }
}
public class FileDialogDemo
{
    public static void main(String args[])
    {
        new SampleFrame();
    }
}
