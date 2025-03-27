import java.io.*;
import java.net.*;

class URLPrinter {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://google.com");
            URL url = uri.toURL();
            URLConnection uc = url.openConnection();
            System.out.println("URL: " + uc.getURL());

        } catch(URISyntaxException e) {
            System.out.println(e.getMessage());

        } catch(MalformedURLException exx) {
            System.out.println(exx.getMessage());

        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}