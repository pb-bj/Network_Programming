import java.net.*;
import java.io.*;
import java.util.*;

public class HeaderInfo{
    public static void main (String[] args) {
            
            String[] urls = {
                "https://merolagani.com/StockQuote.aspx#",
                "https://ekantipur.com/",
            };
        try {
            for( String uri_raw : urls){
                URI uri = new URI(uri_raw);
                URL url = uri.toURL();
                URLConnection uc = url.openConnection();
                System.out.print("HeaderInfo:"+ url.toString()+"------------");
                System.out.print("\ncontent-type:"+uc.getContentType());
                System.out.print("\ncontent-length:"+uc.getContentLength());
                System.out.print("\ncontent-encoding:"+uc.getContentEncoding());
                System.out.print("\nDate Info:"+ new Date(uc.getDate()));
                System.out.print("\n Expiration Date:"+uc.getExpiration());
                System.out.print("\n Last Modified Date:"+ new Date(uc.getLastModified()));
            }
        } catch(URISyntaxException e) {
            System.out.print(e);
        }
        catch(MalformedURLException e){
            System.out.print(e);
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}