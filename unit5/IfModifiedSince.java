import java.io.*;
import java.net.*;
import java.util.*;
public class IfModifiedSince{
    public static void main (String[] args) {
        
        int ch;
        Date today = new Date();
        long millisecondsPerDay = 24*60*60*1000;
        try {
            URI uri = new URI("https://www.oreilly.com/");
            URL url = uri.toURL();
            URLConnection uc = url.openConnection();
            System.out.print("original if modified: "+uc.getIfModifiedSince());
            uc.setIfModifiedSince((new Date(today.getTime()-millisecondsPerDay).getTime()));
            System.out.print("will print only modified since: "+uc.getIfModifiedSince());
            InputStream in = uc.getInputStream();
            while((ch = in.read())!=-1){
                System.out.print((char)ch);
            }
            
        } catch(URISyntaxException e) {
            System.out.print("Message"+e.getMessage());
        }catch(MalformedURLException ex){
            System.out.print("Message"+ ex.getMessage());
        }catch(IOException ey){
            System.out.print("Message"+ ey.getMessage());
        }
    }
}