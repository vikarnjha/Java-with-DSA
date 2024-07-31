public class logicalComplementOperator {
    public static void main(String[] args) {
        // The logical complement operator ! negates a boolean value. Therefore, !true results in false.

        boolean isTrue = true;
        boolean isFalse = !isTrue; // Negate the value of isTrue

        System.out.println("The value of isTrue: " + isTrue);
        System.out.println("The value of isFalse: " + isFalse);

        // Output
        // The value of isTrue: true
        // The value of isFalse: false
    }
}
