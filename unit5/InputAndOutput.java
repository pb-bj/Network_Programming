import java.io.*;
import java.net.*;

class InputAndOutput {
    public static void main(String[] args) {
        int ch;
        try {
            URI uri = new URI("https://google.com");
            URL url = uri.toURL();
            URLConnection uc = url.openConnection();
            uc.setDoInput(false);
            System.out.println("Input Operation? " + uc.getDoInput());

            if(!uc.getDoInput()) {
                uc.setDoInput(true);
                InputStream in = uc.getInputStream();
                    
                    while((ch=in.read()) != -1) {
                        System.out.println((char) ch);
                  }

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