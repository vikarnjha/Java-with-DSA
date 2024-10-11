import java.io.*;

public class DataStreamOperations {

    // Method to write primitive data types to a file
    public static void writeData(String file) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(123);
            dos.writeFloat(10.5f);
            dos.writeDouble(99.99);
            dos.writeBoolean(true);
            System.out.println("Data written to file: " + file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read primitive data types from a file
    public static void readData(String file) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            System.out.println("Reading data from file: " + file);
            System.out.println("Int: " + dis.readInt());
            System.out.println("Float: " + dis.readFloat());
            System.out.println("Double: " + dis.readDouble());
            System.out.println("Boolean: " + dis.readBoolean());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String dataFile = "data.dat";

        // Write primitive data to the file
        writeData(dataFile);

        // Read primitive data from the file
        readData(dataFile);
    }
}
