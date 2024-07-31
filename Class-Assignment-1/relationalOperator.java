public class relationalOperator {

    public static void main(String[] args) {
        System.out.println(5 == 5);

        String str1 = "apple";
        String str2 = "orange";

        boolean areEqual = str1.equals(str2);
        System.out.println("Are the strings equal? " + areEqual);

        System.out.println(5 != 3);
        System.out.println(8 > 5);
        System.out.println(3 < 7);
        System.out.println(6 >= 6);
        System.out.println(2 <= 4);
    }
}

// Output
// true
// Are the strings equal? false
// true
// true
// true
// true
// true
