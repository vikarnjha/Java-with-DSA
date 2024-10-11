import java.io.*;

public class ExceptionHandlingWithFiles {

    // Method demonstrating file operations with exception handling
    public static void fileOperationWithExceptionHandling(String inputFile) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";
        fileOperationWithExceptionHandling(inputFile);
    }
}

// Output
// This is a test file.