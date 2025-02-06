import java.net.InetAddress;
import java.net.UnknownHostException;


// returns list of particular ip address of a domain.

public class GetName {
    public static void main(String[] args) {
        try {
            InetAddress[] address = InetAddress.getAllByName("www.linkedin.com");
            for(InetAddress ads : address) {
                System.out.println(ads);
            }
        }  catch(UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }     
    }
}