import java.net.UnknownHostException;
import java.net.InetAddress;

// provides local machine address
public class MyAddress {
    public static void main(String[] args) {
        try {
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local address" + localAddress);
        } catch(UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }
    }
}