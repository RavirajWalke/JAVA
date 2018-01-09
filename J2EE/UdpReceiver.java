import java.io.*;
import java.net.*;
public class UdpReceiver {
    public static void main(String[] args) throws Exception
    {
        byte data[]=new byte[1000];
        DatagramPacket packet=new DatagramPacket(data, data.length);
        DatagramSocket socket=new DatagramSocket(4567);
        socket.receive(packet);
        String msg=new String(packet.getData(),0,packet.getLength());
        System.out.println("Message from server="+msg);
    }
}
