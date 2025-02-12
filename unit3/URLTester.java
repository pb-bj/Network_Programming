package unit3;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
public class URLTester {
    public static void main(String[] args) {
        try{
            URI uri = new URI("https","google.com","javase/B/docs/api/java/net/URI.html");
            URL url = uri.toURL();
            System.out.println("Authority"+ url.getAuthority());
            System.out.println("host"+url .getHost());
            System.out.println("host"+url .getPath());
            System.out.println("host"+url .getPort());


        }catch(MalformedURLException ex){
            System.out.println(ex.getMessage());

        }
        catch(URISyntaxException ex)
        {
            System.out.println(ex.getMessage());

        }
    }

    
}
