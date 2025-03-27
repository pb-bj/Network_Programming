import java.net.*;
import java.io.*;

class SocketInfo {
    public static void main (String[] args) {
        try {
            Socket s = new Socket();
            SocketAddress address = new InetSocketAddress("www.oreilly.com", 80);
            s.connect(address);
            System.out.println("Connected to host: " + s.getInetAddress().getHostAddress());
            System.out.println("on port: " + s.getPort());
            System.out.println("Connected on local host: " + s.getLocalAddress().getHostName());
            System.out.println("Connected on local port: " + s.getLocalPort());
            s.close(); 
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}