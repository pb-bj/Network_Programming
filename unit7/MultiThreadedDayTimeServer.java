import java.net.*;
import java.io.*;
import java.util.Date;

public class MultiThreadedDayTimeServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(13);
            while(true) {
                Socket connection = server.accept();
                Thread task = new DayTimeThread(connection);
                task.start();               
            }
        } catch(IOException e) {
            System.err.println("Couldnt start server");
        }
    }

    private static class DayTimeThread extends Thread {
        private Socket connection;
        DayTimeThread(Socket connection) {
            this.connection = connection;
        }

        public void run() {
            try {
                Writer out = new OutputStreamWriter(connection.getOutputStream());
                Date now = new Date();
                out.write(now.toString() +"\r\n");
                out.flush();
            } catch (IOException ex) {
                System.err.println(ex);
            } finally {
                try {
                connection.close();
                } catch (IOException e) {
                } 
    }
}
    }
}