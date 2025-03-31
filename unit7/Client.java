import java.net.*;
import java.io.*;
import java.util.*;

class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 13);
            InputStream in = s.getInputStream();
            int ch;
            while( (ch = in.read()) != -1) {
                System.out.print((char)ch);
            }

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}