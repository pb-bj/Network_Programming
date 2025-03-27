import java.net.*;
import java.io.*;
import java.util.*;
public class ArbitaryHeader{
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
                System.out.print("\ncontent-type:"+uc.getHeaderField("content-type"));
                System.out.print("\ncontent-length:"+uc.getHeaderField("content-length") + " bytes");
                System.out.print("\nx-frame options:"+uc.getHeaderField("x-frame-options"));
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