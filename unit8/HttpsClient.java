import java.io.*;
import javax.net.SSLSocket;
import javax.net.SSLSocketFactory;

class HttpsClient {
    public static void main(String[] args) {
        String host = "www.usps.com";
        int port = 443;
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = null;
        
        try {
            socket = (SSLSocket) factory.createSocket(host, port);
            String[] supported = socket.getSupportedCipherSuites();
             socket.setEnabledCipherSuites(supported);

             Writer out = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
                // https requires the full URL in the GET line
                out.write("GET http://" + host + "/ HTTP/1.1\r\n");
                out.write("Host: " + host + "\r\n");
                out.write("\r\n");
                out.flush();
                // read response
                BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
                // read the header
                String s;
                while (!(s = in.readLine()).equals("")) {
                System.out.println(s);
                }
                System.out.println();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}