package unit3;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GetContentDemo {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://media.gettyimages.com/id/2164334242/photo/triangular-shaped-tunnel.jpg?s=1024x1024&w=gi&k=20&c=ocfYosx04DiSgzqFo5tvGD5PCSMhaqo4ZjRfFsG2tQk=");
            URL url = uri.toURL();
            System.out.println(url.getContent().getClass());

        } catch(URISyntaxException exx) {
            System.out.println(exx.getMessage());
        
        } catch(MalformedURLException ex) {
            System.out.println(ex.getMessage());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
