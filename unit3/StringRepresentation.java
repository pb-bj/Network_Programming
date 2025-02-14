import java.net.*;

class StringRepresentation {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://bcanotesnepal.com/");
            System.out.println(uri.toString());
            System.out.println(uri.toASCIIString());

        } catch(URISyntaxException ex) {
            System.out.println(ex.getMessage());
        }
    }
}