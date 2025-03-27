import java.net.*;
import java.io.*;

public class DayTimeClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("time.nist.gov", 13);
            socket.setSoTimeout(15000); 

            InputStream in = socket.getInputStream();
            int ch;
            while ((ch = in.read()) != -1) {
                System.out.print((char) ch); 
            }
            
            socket.close(); 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
