package unit3;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

// splitting url 
// scheme://authority/path/?query#section

public class URLPieces {
    public static void main(String[] args) {
        String[] urls = {
                "https://docs.oracle.com/java",
                "https://oreilly.com",
                "https://admin@www.blackstar.com:8080/"
            };
        try {
            for (String path : urls) {
                URI uri = new URI(path);
                URL url = uri.toURL();
                System.out.println("--------For url:" + path + "------");

                System.out.println("File: " + url.getFile());
                System.out.println("Host: " + url.getHost());
                System.out.println("Port: " + url.getPort());
                System.out.println("Protocol: " + url.getProtocol());
                System.out.println("Ref: " + url.getRef());
                System.out.println("Query: " + url.getQuery());
                System.out.println("Path: " + url.getPath());
                System.out.println("UserInfo: " + url.getUserInfo());
                System.out.println("Authority: " + url.getAuthority());
            }
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch(MalformedURLException ex) {
            System.out.println(ex.getMessage());
        }
    }    
}
