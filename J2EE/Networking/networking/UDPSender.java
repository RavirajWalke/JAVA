/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

/**
 *
 * @author Ravi
 */

import java.net.*;
import java.io.*;
public class UDPSender {
    public static void main(String[] args) throws Exception
    {
        String msg="Hi How are you";
        byte data[]=msg.getBytes();
        DatagramPacket packet=new DatagramPacket(data, data.length,InetAddress.getLocalHost(), 4567);
        DatagramSocket socket=new DatagramSocket();
        socket.send(packet);
    }
}

