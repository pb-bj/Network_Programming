import java.io.*;
import java.net.*;

class RequestProperty {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://ekantipur.com/");
            URL url = uri.toURL();
            URLConnection uc = url.openConnection();
            uc.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.360");
            System.out.println(uc.getRequestProperty("user-agent"));


        } catch(URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch(MalformedURLException exx) {
            System.out.println(exx.getMessage());
        } catch(IOException ex1) {
            System.out.println(ex1.getMessage());
        }
    }
}
