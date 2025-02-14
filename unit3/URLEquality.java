import java.net.*;

class URLEquality{
    public static void main (String[] args) {
        try {
            URI uri1 = new URI("https://www.google.com.np/");
            URL url1 = uri1.toURL();
            
            URI uri2 = new URI("https://www.google.com.np/");
            URL url2 = uri2.toURL();
            
            if(url1.equals(url2)){
                System.out.print("same urls");
            } else{
                System.out.print("They are different");
            }
            
            System.out.print(url1.hashCode() + "" + uri2.hashCode());
        } catch(URISyntaxException e) {
            System.out.print(e.getMessage());
        }
        catch(MalformedURLException ex1){
            System.out.print(ex1.getMessage());
        }
    }
}
