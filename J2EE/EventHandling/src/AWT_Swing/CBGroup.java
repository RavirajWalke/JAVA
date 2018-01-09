/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT_Swing;

/**
 *
 * @author Ravi
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class CBGroup extends Applet implements ItemListener
{
    CheckboxGroup cbg;
    Checkbox macOS,Windows,Android,Linux;
    String msg;
    public void init()
    {
        cbg=new CheckboxGroup();
        macOS=new Checkbox("MacOS",cbg,true);
        Windows=new Checkbox("Windows",cbg,false);
        Android=new Checkbox("Android",cbg,false);
        Linux=new Checkbox("Linux",cbg,false);
        add(macOS);
        add(Windows);
        add(Android);
        add(Linux);
       macOS.addItemListener(this);
       Windows.addItemListener(this);
       Android.addItemListener(this);
       Linux.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
       repaint();
    }
    public void paint(Graphics g)
    {
        msg="Current Item Selected: ";
        msg+=cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg, 80, 80);
    }
}