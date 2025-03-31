import java.net.*;

public class LocalPortScanner {
    public static void main(String[] args) {
        for(int i=1; i<=65535; i++) {
            try {
                ServerSocket server = new ServerSocket(i);
                System.out.println("Connection established on port: " + i);
                server.close();

            } catch(Exception e) {
                System.out.println("There is a server on port:" + i);
            }
        }

    }
}