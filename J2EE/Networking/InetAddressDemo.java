/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi
 */
import java.net.*;
public class InetAddressDemo
{
    public static void main(String args[])
    {
        try
        {
            System.out.println(InetAddress.getLocalHost());
            System.out.println(InetAddress.getByName("www.google.com"));
            System.out.println(InetAddress.getAllByName("www.google.com"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
