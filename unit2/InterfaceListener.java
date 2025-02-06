package unit2;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class InterfaceListener {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> nis = NetworkInterface.getNetworkInterfaces();
            System.out.println("following arae the network interface");

            while (nis.hasMoreElements()) {
                NetworkInterface x = nis.nextElement();
                System.out.println(x.getName());
            }
        } catch (SocketException e) {
            System.out.println(e.getMessage());
        }
    }
}
