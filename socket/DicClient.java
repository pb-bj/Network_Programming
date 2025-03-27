import java.net.*;
import java.io.*;

class DicClient {
    public static void main (String[] args) {
        try {
            Socket s = new Socket("dict.org", 2628);
            s.setSoTimeout(15000);

            OutputStream out = s.getOutputStream();
            Writer writer = new OutputStreamWriter(out, "UTF-8");

            writer.write("DEFINE fd-eng-lat flower\r\n");
            writer.flush();

            InputStream in = s.getInputStream();
            int ch;
            while( (ch = in.read()) != -1) {
                System.out.print((char)ch);
            }
            
            in.close();
            writer.close();
            s.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}