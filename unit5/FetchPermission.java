import java.io.*;
import java.net.*;
import java.security.Permission;

class FetchPermission {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://google.com");
            URL url = uri.toURL();
            URLConnection uc = url.openConnection();

            Permission p = uc.getPermission();
            System.out.println(p.toString());

        } catch(URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch(MalformedURLException exx) {
            System.out.println(exx.getMessage());
        } catch(IOException ex1) {
            System.out.println(ex1.getMessage());
        }
    }
}
