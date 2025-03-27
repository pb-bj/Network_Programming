import java.net.*;
import java.io.*;

class ReadServer {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.google.com");
            URL url = uri.toURL();
            URLConnection connection = url.openConnection();
            InputStream raw = connection.getInputStream(); // read data
            InputStream buffer = new BufferedInputStream(raw); 

            Reader reader = new InputStreamReader(buffer);
            int ch;
                while((ch = reader.read()) != -1){
                    System.out.print((char)ch);
                }
        } catch(MalformedURLException ex) {
            System.out.println(ex.getMessage());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }

        }
}