import java.net.*;
import java.io.*;
import java.nio.file.*;

public class BinarySaver {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                URI uri = new URI(args[i]);  
                URL root = uri.toURL();    
                saveBinaryFile(root);
            } catch (MalformedURLException ex) {
                System.err.println(args[i] + " is not a URL I understand.");
            } catch (IOException ex1) {
                System.err.println("Error saving file from: " + args[i]);
                ex1.printStackTrace();  // Print the exception stack trace for better debugging
            } catch (URISyntaxException ex2) {
                System.err.println("Invalid URI Syntax: " + ex2.getMessage());
            }
        }
    }

    public static void saveBinaryFile(URL u) throws IOException {
        URLConnection uc = u.openConnection();  // Open the URL connection
        String contentType = uc.getContentType();
        int contentLength = uc.getContentLength();

        // Skip text-based content or content with no data
        if (contentType.startsWith("text") || contentLength == 0) {
            System.out.println("Skipping text or empty content from: " + u);
            return;
        }

        // Get the file name from the URL
        String fileName = getFile(u);

        // Create output stream to save the file
        try (InputStream in = uc.getInputStream();
             FileOutputStream out = new FileOutputStream(fileName)) {

            byte[] buffer = new byte[1024];  // Buffer to read data
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);  // Write the data to the file
            }
            System.out.println("File saved: " + fileName);
        } catch (IOException e) {
            System.err.println("Error downloading from: " + u);
            throw e;  // Rethrow the exception after logging
        }
    }

    public static String getFile(URL u) {
        String fileName = u.getPath();  // Get the path part of the URL
        if (fileName.endsWith("/")) {
            fileName = fileName.substring(0, fileName.length() - 1);  // Remove trailing slash
        }

        int lastSlashIndex = fileName.lastIndexOf('/');
        if (lastSlashIndex >= 0) {
            fileName = fileName.substring(lastSlashIndex + 1);  // Extract everything after the last '/'
        }

        // If no file name was found, use a default name
        if (fileName.isEmpty()) {
            fileName = "downloaded_file";
        }

        return fileName;
    }
}