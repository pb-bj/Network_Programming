import java.net.*;
import java.io.*;

// constructing without connect
class WithoutConnect {
    public static void main (String[] args) {
        try {
            Socket s = new Socket();
            SocketAddress address = new InetSocketAddress("www.oreilly.com", 80);
            s.connect(address);
            s.close(); 
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}