class student {
    int roll;
    String name;
    void insertRecord(int r, String n){
        roll=r;
        name=n;
    }
    void displayInformation (){
        System.out.println(roll+name);
    }
}
public class testStudent4 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.insertRecord(111, " Karan");
        s2.insertRecord(112, " Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
