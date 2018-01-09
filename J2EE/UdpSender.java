
import java.net.*;
import java.io.*;
public class UdpSender {
    public static void main(String[] args) throws Exception
    {
        String msg="Hi How are you";
        byte data[]=msg.getBytes();
        DatagramPacket packet=new DatagramPacket(data, data.length,
                InetAddress.getLocalHost(), 4567);
        DatagramSocket socket=new DatagramSocket();
        socket.send(packet);
    }
}
