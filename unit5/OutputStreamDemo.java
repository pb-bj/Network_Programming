import java.net.*;
import java.io.*;

class OutputStreamDemo {
    public static void main(String[] args) {
        try {
            URI uri = new URI("");
            URL url = uri.toURL();
            URLConnection uc = uc.openConnection();
            uc.setDoOutput(false);

            OutputStream raw = uc.getOutputStream();

            OutputStream raw = 
        }  catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch (MalformedException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException exx ) {
            System.out.println(exx.getMessage());
        }
    }
}