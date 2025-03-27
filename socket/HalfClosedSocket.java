import java.net.*;
import java.io.*;

// partially socket close using shutdownOutput()
class HalfClosedSocket {
    public static void main (String[] args) {
        try {
            Socket s = new Socket("www.oreilly.com", 80);
            s.shutdownOutput();  // for partially socket close
            if(s.isOutputShutdown()) {
                System.out.println("Cannot perform write operation");
            } else {
                System.out.println("Eligible for write operation");
            }
            s.close(); // fully socket closed
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}