package unit3;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadPageFromInputStream {

    // use of getInputStream
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.nbcnews.com/");
            URL url = uri.toURL();
            URLConnection connection = url.openConnection();
            InputStream in = connection.getInputStream();
            int ch;
            while ((ch = in.read()) != -1) {
                System.out.print((char) ch);
            }
            in.close(); // Close the InputStream to prevent leaks
        } catch (URISyntaxException ex) {
            System.out.println(ex.getMessage());
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

