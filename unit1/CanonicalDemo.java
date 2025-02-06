import java.net.UnknownHostException;
import java.net.InetAddress;

public class CanonicalDemo {
    public static void main(String[] args) {
        try {
            InetAddress x = InetAddress.getByName("107.23.216.196");
            System.out.println("Domain Name: " + x.getCanonicalHostName());

        } catch(UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }
    }
}