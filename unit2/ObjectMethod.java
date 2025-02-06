package unit2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ObjectMethod {
    public static void main(String[] args) {
        try {
            InetAddress ad1 = InetAddress.getByName("www.nagarjunacollege.edu.np");
            InetAddress ad2 = InetAddress.getByName("209.159.155.2");

            if (ad1.equals(ad2)) {
                System.out.println("The adddresses are equal");
            } else {
                System.out.println("They are not same");
            }

            System.out.println("Hash representation:" + ad1.hashCode());
            System.out.println("String representation:" + ad2.toString());
        } catch (UnknownHostException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
