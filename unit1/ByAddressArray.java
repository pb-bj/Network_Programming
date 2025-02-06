import java.net.UnknownHostException;
import java.net.InetAddress;

public class ByAddressArray {
    public static void main(String[] args) {
        try {
            byte[] ads = { 107, 23, (byte) 216, (byte) 196};
            InetAddress inet = InetAddress.getByAddress(ads);
            System.out.println(inet.getHostName());
            System.out.println(inet.getHostAddress());

        } catch(UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }
    }
}