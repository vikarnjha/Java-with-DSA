import java.io.*;

public class CharacterStreamOperations {

    // Method to read from a file using FileReader and write using FileWriter
    public static void fileReaderWriter(String inputFile, String outputFile) {
        try {
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);
            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }
            reader.close();
            writer.close();
            System.out.println("Content copied from " + inputFile + " to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read from a file using BufferedReader and write using BufferedWriter
    public static void bufferedReaderWriter(String inputFile, String outputFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
            System.out.println("Buffered content copied from " + inputFile + " to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Using FileReader and FileWriter
        fileReaderWriter(inputFile, outputFile);

        // Using BufferedReader and BufferedWriter
        bufferedReaderWriter(inputFile, outputFile);
    }
}
