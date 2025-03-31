import java.net.*;
public class ServerInfo {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(80);
            System.out.println("Running on ip: " + server.getInetAddress().getHostAddress() );
            System.out.println("Listening to port:  " + server.getLocalPort() );
            server.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}