import java.io.*;

public class FileOperations {

    // Method to read from a file and display contents on the console
    public static void readFile(String inputFile) {
        try {
            File file = new File(inputFile);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Reading file: " + inputFile);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to write content from one file to another
    public static void writeFile(String inputFile, String outputFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            String line;
            System.out.println("Writing content from " + inputFile + " to " + outputFile);
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }

    // Method to append data to an existing file
    public static void appendToFile(String outputFile, String data) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true)); // 'true' enables appending
            bw.write(data);
            bw.newLine();
            bw.close();
            System.out.println("Appended data to file: " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        
        // 1. Read from the input file and display the content on the console
        readFile(inputFile);

        // 2. Write the content from input file to output file
        writeFile(inputFile, outputFile);

        // 3. Append data to the output file
        String dataToAppend = "This is the appended text.";
        appendToFile(outputFile, dataToAppend);
    }
}
