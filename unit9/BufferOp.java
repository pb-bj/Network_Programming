import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class BufferOp {
    public static void main(String[] args) {
        Path file = null;
        BufferedReader bufferedReader = null; // store content of a file
        try {
            file = Path.of("src.txt");
            InputStream inputStream = Files.newInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println("Reading the Line of src.txt file: "+ bufferedReader.readLine());  
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
