import java.io.*;
import java.net.*;

class DoOutput {
    public static void main(String[] args) {
        int ch;
        try {
            URI uri = new URI("https://oreilly.com");
            URL url = uri.toURL();
            URLConnection uc = url.openConnection();

                if(uc.getDoOutput()) {
                    System.out.println("Write operation available by default");

                } else {
                    uc.setDoOutput(true);
                    System.out.println("configured connection for POST request");
                }

        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException exx) {
            System.out.println(exx.getMessage());
        }
    }
}