package unit3;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class OpenConnectionDemo {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.ekantipur.com");
            URL url = uri.toURL();
            URLConnection uc = url.openConnection();
            InputStream in = uc.getInputStream();

            int ch;
            while ((ch = in.read()) != -1) {
                System.out.print((char)ch);
            }

        } catch (URISyntaxException ex) {
            System.out.println(ex.getMessage());
        } catch (MalformedURLException e)  {
            System.out.println(e.getMessage());
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
