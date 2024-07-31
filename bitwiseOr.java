public class bitwiseOr {
    public static void main(String[] args) {
        // The bitwise OR operator | compares each bit of two integers and returns a new integer whose bits are set to 1 if either of the corresponding bits of the original integers are 1.

        // The result of 5 | 3 can be calculated as follows:
        // 5: 0101 (binary representation)
        // 3: 0011 (binary representation)
        // 7: 0111 (result of bitwise OR)
        // So, 5 | 3 results in 7.
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int result = a | b; // Bitwise OR

        System.out.println("The result of 5 | 3 is: " + result);
        // The result of 5 | 3 is: 7
    }
}
