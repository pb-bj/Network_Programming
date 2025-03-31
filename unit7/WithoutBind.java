import java.net.*;

public class WithoutBind {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket();
            SocketAddress socket = new InetSocketAddress(80);
            server.bind(socket);
            System.out.println("Listening on local Port: " + server.getLocalPort());
            server.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}