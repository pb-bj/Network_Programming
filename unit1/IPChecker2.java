import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPChecker2 {
    public static void main(String[] args) {
        try {
            InetAddress[] ads = InetAddress.getAllByName("www.facebook.com"); // for multiple ip address
            
            for (InetAddress x : ads) {
                byte[] bytes = x.getAddress();

                if(bytes.length == 4) {
                    System.out.println("This is IPv4:  " +  x.getHostAddress());
                } else if (bytes.length == 16) {
                    System.out.println("This is ipv6: " + x.getHostAddress() ) ;
                } else {
                    System.out.println("Unknow address");
                }
                
            }
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }      
    }
}
