public class bitwiseAnd {
    public static void main(String[] args) {
        // The bitwise AND operator & compares each bit of two integers and returns a new integer whose bits are set to 1 only if both corresponding bits of the original integers are also 1.

        // The result of 5 & 3 can be calculated as follows:

        // 5: 0101 (binary representation)
        // 3: 0011 (binary representation)
        // 1: 0001 (result of bitwise AND)
        // So, 5 & 3 results in 1.

        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int result = a & b; // Bitwise AND

        System.out.println("The result of 5 & 3 is: " + result);
        // The result of 5 & 3 is: 1
    }
}
