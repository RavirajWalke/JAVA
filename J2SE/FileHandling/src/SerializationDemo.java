
import java.io.FileOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Myclass implements Serializable
{
    int i;double d;String s;
    Myclass(int i,String s,double d)
    {
        this.s = s;
this.i = i;
this.d = d;
    }
    public String toString()
    {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}
public class SerializationDemo
{
    public static void main(String args[])
    {
        try(ObjectOutputStream objout=new ObjectOutputStream(new FileOutputStream("Serial.txt")))
        {
            Myclass obj1=new Myclass(12,"ssss",2.3);
            System.out.println(obj1);
            objout.writeObject(obj1);
        }
        catch (IOException ex) {
            Logger.getLogger(SerializationDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try(ObjectInputStream objin=new ObjectInputStream(new FileInputStream("Serial.txt")))
        {
            Myclass obj2=(Myclass)objin.readObject();
            System.out.println(obj2);
        }
        catch(Exception ioe)
        {
            ioe.printStackTrace();
        }
    }
}
