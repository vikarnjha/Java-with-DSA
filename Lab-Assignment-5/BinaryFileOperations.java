import java.io.*;

public class BinaryFileOperations {

    // Method to copy a binary file without buffering
    public static void copyBinaryFile(String sourceFile, String destinationFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Binary file copied from " + sourceFile + " to " + destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to copy a binary file with buffer support
    public static void copyBinaryFileWithBuffer(String sourceFile, String destinationFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream(destinationFile);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("Binary file copied with buffering from " + sourceFile + " to " + destinationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // Copy binary file without buffering
        copyBinaryFile(sourceFile, destinationFile);

        // Copy binary file with buffering
        copyBinaryFileWithBuffer(sourceFile, destinationFile);
    }
}
