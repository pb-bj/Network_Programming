import java.net.*;
import java.io.*;
import java.util.Date;
import java.util.logging.*;

public class LoggingServer {
    private static final Logger auditLog = Logger.getLogger("request");
    private static final Logger errorLog = Logger.getLogger("error");

    public static void main (String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(6668);
            while(true) {
                Socket connection = server.accept();
                auditLog.info(new Date().toString() + " " + connection.getRemoteSocketAddress());
                Writer out = new OutputStreamWriter(connection.getOutputStream());
                Date now = new Date();
                auditLog.info("writting to stream");
                out.write(now.toString()+ "\r\n");
                out.flush();
            }
        } catch(IOException ex) {
            errorLog.log(Level.SEVERE, ex.getMessage());
        } finally {
            try {
                server.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
