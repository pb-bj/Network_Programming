package unit2;

import java.net.NetworkInterface;
import java.net.SocketException;


public class NetworkInterfaceDemo {
    // Network Interface => end point of internet and throws SocketException
    // pa = 74-E6-E2-31-BD-FB

    public static void main(String[] args) {
        try {
            // InetAddress ads = InetAddress.getByName("127.0.0.01");
            // NetworkInterface ni = NetworkInterface.getByInetAddress(ads);
            NetworkInterface ni = NetworkInterface.getByName("lo");
            if (ni == null) {
                System.out.println("No such interface");
            } else {
                System.out.println("log exist" + ni);
            }

        } catch (SocketException ex) {
            System.out.println(ex.getMessage());
        } 
        // catch (UnknownHostException e) {
        //     System.out.println(e.getMessage());
        // }
    }
}
