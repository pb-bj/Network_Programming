package unit3;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ProtocolTester {

    public static void Tester(String url) {
        try {
            URI uri = new URI(url);
            URL test_url = uri.toURL();
            System.out.println(test_url.getProtocol() + "is supported");

        } catch (URISyntaxException ex) {
            String protocol = url.substring(0, url.indexOf(":"));
            System.out.println(protocol + "not supported");

        } catch (MalformedURLException ex) {
            String protocol = url.substring(0, url.indexOf(":"));
            System.out.println(protocol + "not supported");
        }
    }

    public static void main(String[] args) {
        String[] urls = {

                "https://www.aamazon.com/exec/obios/order2/",
        };
        for (String url : urls) {
            Tester(url);
        }
    }
}