import java.net.*;
import java.io.*;

class GuessContentType {
    public static void main(String[] args) {
        try {
            URI uri = new URI();
            URL url = uri.toURL();
            URLConnection uc = uc.openConnection();
            
            String content_type = uc.GuessContentTypeFromStream(uc.getInputStream());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}