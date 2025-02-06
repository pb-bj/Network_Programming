import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPChecker {
    public static void main(String[] args) {
        try {
            InetAddress ads = InetAddress.getByName("www.google.com"); // for single ip address
            byte[] bytes = ads.getAddress();
            if(bytes.length == 4) {
                System.out.println("This is IPv4:  " +  ads.getHostAddress());
            } else if (bytes.length == 16) {
                System.out.println("This is ipv6: " + ads.getHostAddress() ) ;
            } else {
                System.out.println("Unknow address");
            }
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }      
    }
}
