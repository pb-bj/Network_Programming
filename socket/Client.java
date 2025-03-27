import java.net.*;
import java.io.*;

class Client {
    public static void main(String[] args) {  
    try{      
        Socket s=new Socket("localhost",6666);  
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
        dout.writeUTF("Hello from client");  
        dout.flush();  
        dout.close();  
        s.close();  
    } catch(Exception e) {
        System.out.println(e);
        }  
    }  
}