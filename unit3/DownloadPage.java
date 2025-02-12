package unit3;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class DownloadPage {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://nagarjunacollege.edu.np");
            URL url = uri.toURL();
            InputStream in = url.openStream();

            System.out.println("Download start");
            int ch;
            while (( ch = in.read()) != -1) {
                System.out.print((char)ch);
            }
            System.out.println("---Download Completed---");
        } catch(URISyntaxException exx) {
            System.out.println(exx.getMessage());
        
        } catch(MalformedURLException ex) {
            System.out.println(ex.getMessage());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
