import java.io.*;

class Student implements Serializable {
    String name;
    int id;
    double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", grade=" + grade + "}";
    }
}

public class SerializationOperations {

    // Method to serialize a Student object
    public static void serializeStudent(Student student, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(student);
            System.out.println("Student object serialized to file: " + file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to deserialize a Student object
    public static Student deserializeStudent(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Student student = (Student) ois.readObject();
            System.out.println("Student object deserialized from file: " + file);
            return student;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String studentFile = "student.ser";
        Student student = new Student("John", 101, 4.0);

        // Serialize the student object
        serializeStudent(student, studentFile);

        // Deserialize the student object
        Student deserializedStudent = deserializeStudent(studentFile);
        System.out.println("Deserialized Student: " + deserializedStudent);
    }
}

// Output
// Student object serialized to file: student.ser
// Student object deserialized from file: student.ser
// Deserialized Student: Student{name='John', id=101, grade=4.0}