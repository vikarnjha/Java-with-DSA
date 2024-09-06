class Person {
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
}
class Employee extends Person {
    private String jobTitle;
    public Employee(String name, int age, String jobTitle){
        super(name, age);
        this.jobTitle=jobTitle;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);  // Accessible directly
        System.out.println("Age: " + age);    // Accessible directly
        System.out.println("Job Title: " + jobTitle);
    }
}
public class Main{
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("John Doe", 30, "Software Engineer");
        
        // Displaying all details of the employee
        emp.displayDetails();
    }
}
