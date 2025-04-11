import java.net.*;
import java.io.*;

class DayTimeUDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(0);
            socket.setSoTimeout(10000);

            InetAddress address = InetAddress.getByName("time.nist.gov");
            DatagramPacket request = new DatagramPacket(new byte[1], 1, address, 13);
            DatagramPacket response = new DatagramPacket(new byte[1024], 1024);

            socket.send(request);
            socket.receive(response);

            System.out.println(response.getData());

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
