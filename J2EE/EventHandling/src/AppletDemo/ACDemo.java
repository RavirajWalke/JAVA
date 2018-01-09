/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppletDemo;

/**
 *
 * @author Ravi
 */
import java.applet.*;
import java.awt.*;
import java.net.*;
public class ACDemo extends Applet
{
   public void start()
   {
       AppletContext ac=getAppletContext();
       URL url=getCodeBase();
       try{
           ac.showDocument(new URL(url+"Test.html"));
       }
       catch(Exception e)
       {
           showStatus("URL NOT FOUND!");
       }
   }
}
