class student {
    int id; // Decleare an integer field for student id
    String name; // Decleare an string field for student name
}
public class testStudent2 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.id = 101;
        s1.name = "Sonoo";
        System.out.println(s1.id + " " + s1.name);
    }
}
