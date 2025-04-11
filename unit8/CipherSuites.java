import java.io.*;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

class CipherSuites {
    public static void main(String[] args) {
        String host = "www.usps.com";
        int port = 443;
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = null;
        try {
            socket = (SSLSocket) factory.createSocket(host, port);
            String[] supported = socket.getSupportedCipherSuites();
             socket.setEnabledCipherSuites(supported);
                System.out.println("Available client");

             for(String cipher: supported) {
                System.out.println(cipher);
             }
             socket.setEnabledCipherSuites(supported);

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }       
}