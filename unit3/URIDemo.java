
import java.net.*;

class URIDemo {
    public static void main(String[] args) {
        try {
            String[] uris = {
                "tel:+1-800-9988-9938",
                "http://www.xml.com/pub/a/2003/09/17/stax.html#id=_hbc",
                "urn:isbn:1-565-92870-9",
            };

            for(String uri_path : uris) {
                URI uri = new URI(uri_path);
                System.out.println("Path" + uri.getPath());
                System.out.println("Query" + uri.getQuery());
                System.out.println("Authority" + uri.getAuthority());
                System.out.println("Host: " + uri.getHost());
            }
        } catch(URISyntaxException ex) {
        System.out.println(ex.getMessage());

        }
    }
}