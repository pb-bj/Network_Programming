import java.net.*;
import java.io.*;
import java.util.*;

class DateTimeServer {
    public static void main (String[] args) {
        try {
            ServerSocket server = new ServerSocket(13);
            // server will wait for the connection req
            while(true) {
                Socket connection = server.accept(); // after connection established
                Writer writer = new OutputStreamWriter(connection.getOutputStream());
                Date currentDate= new Date();
                writer.write(currentDate.toString() + "\n");
                writer.flush();
                connection.close();
            } // now the date will be printed in client.java
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
