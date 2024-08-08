import java.util.*;

public class student {

    private int roll;
    private char grade;
    private float per;

    public void setData() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter roll, Grade, and Percentage: ");
        roll=kb.nextInt();
        grade=kb.next().charAt(0);
        per=kb.nextFloat();
    }

    public void displayData(){
        System.out.println("Roll:- "+roll);
        System.out.println("Grade:- "+grade);
        System.out.println("Percentage:- "+per);
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.setData();
        s1.displayData();
    }
}
