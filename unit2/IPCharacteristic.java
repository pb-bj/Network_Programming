package unit2;

import java.net.InetAddress;
import java.net.UnknownHostException;

//need to asssing command line so javac name  0.0.0.0  for wildcard or 127.0.0.1 for Loopback address
public class IPCharacteristic {
    public static void main(String[] args) {
        try {
            InetAddress ads = InetAddress.getByName(args[0]);
            if (ads.isAnyLocalAddress()) {
                System.out.println("Wildcard address: " + ads.getHostName());
            }
            
            if (ads.isLoopbackAddress()) {
                System.out.println("Loop back address" + ads.getHostName());
            }
            
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }
    }
}
