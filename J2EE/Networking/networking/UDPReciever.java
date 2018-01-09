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
public class UDPReciever
{
    public static void main(String args[])throws Exception
    {
        byte [] data=new byte[100];
        DatagramPacket packet=new DatagramPacket(data,data.length);
        DatagramSocket socket=new DatagramSocket(4567);
        socket.receive(packet);
        String msg=new String(packet.getData(),0,packet.getLength());
        System.out.println(msg);
    }
}
