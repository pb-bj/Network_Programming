import java.net.*;
import java.io.UnsupportedEncodingException;

class URLEncodingDemo {
    public static void main(String[] args) {
        try {
            System.out.println(URLEncoder.encode("Hello world", "UTF-8"));
            System.out.println(URLEncoder.encode("Hello+world#greetings", "UTF-8"));
            System.out.println(URLEncoder.encode("https://www.tpointtech.com/java-url-encoder", "UTF-8"));

            String encode = URLEncoder.encode("https://www.tpointtech.com/java-url-encoder", "UTF-8");
            String decode = URLDecoder.decode(encode, "UTF-8");
            System.out.println("Decoded String: " + decode);
        } catch(UnsupportedEncodingException ex) {
            System.out.println(ex.getMessage());
            
        }
    }
}