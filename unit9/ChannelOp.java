import java.io.*;
import java.nio.channels.*;

class ChannelOp {
    public static void main(String[] args) {
        String[] inputFiles = {"input1.txt", "input2.txt", "input3.txt"};
        String outputFile = "output.txt";
        
        try (
            FileOutputStream output = new FileOutputStream(new File(outputFile));
            WritableByteChannel targetChannel = output.getChannel()
        ) {
            for (int j = 0; j < inputFiles.length; j++) {
                try (
                    FileInputStream input = new FileInputStream(inputFiles[j]);
                    FileChannel inputChannel = input.getChannel()
                ) {
                    inputChannel.transferTo(0, inputChannel.size(), targetChannel);
                } catch (IOException e) {
                    System.err.println("Error processing file " + inputFiles[j] + ": " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Output file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error occurred: " + e.getMessage());
        }
    }
}