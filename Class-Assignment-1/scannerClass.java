
import java.util.Scanner;

public class scannerClass {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.err.println("Enter your name:- ");
        String name = obj.nextLine();
        // System.err.println("Hello, " + name);
        System.out.println("Enter your age:- ");
        int age = obj.nextInt();
        System.out.println("Enter your GPA:- ");
        double gpa = obj.nextDouble();
        System.out.println("Name:- "+name);
        System.out.println("Age:- "+age);
        System.out.println("GPA:- "+gpa);
    }
}
