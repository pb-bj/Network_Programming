import java.io.*;
import java.net.*;

class PortScanner {
    public static void main(String[] args) {
            for(int i = 5000; i <= 65535; i++) {
            try {
                Socket s = new Socket("localhost", i);
                System.out.println("There is server on port: " + i + " on localhost");
                s.close();
            } catch(IOException e) {
                System.out.println(e.getMessage());
            }

            }
    }
}