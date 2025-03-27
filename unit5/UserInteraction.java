import java.net.*;
import java.io.*;

class UserInteraction {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://google.com");
            URL url = uri.toURL();
            URLConnection uc = url.openConnection();

                if(!uc.getAllowUserInteraction()) {
                    uc.setAllowUserInteraction(true);
                }
                System.out.println("User Interaction Allowed? " + uc.getAllowUserInteraction());
        
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException exx) {
            System.out.println(exx.getMessage());
        }
    }
}