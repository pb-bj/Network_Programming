import java.net.InetAddress;
import java.net.UnknownHostException;

public class ByteArray {
    public static void main(String[] args) {
        try {
            InetAddress ads = InetAddress.getByName("www.nagarjunacollege.edu.np");

            System.out.println("Ip address : " + ads.getHostAddress()); // address in string format or dot notation

            byte[] bytes = ads.getAddress();
            for (byte b : bytes) {
                int unsigned = b < 0 ? b + 256 : b; // for negative number add 256
                System.out.println(unsigned + " ");
            }
            System.out.println();
            
        }  catch(UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }     
    }
}