public class bitwiseXOR {
    public static void main(String[] args) {
        // The bitwise XOR operator ^ compares each bit of two integers and returns a new integer whose bits are set to 1 if the corresponding bits of the operands are different.

        // The result of 5 ^ 3 can be calculated as follows:
        // 5: 0101 (binary representation)
        // 3: 0011 (binary representation)
        // 6: 0110 (result of bitwise XOR)
        // So, 5 ^ 3 results in 6

        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int result = a ^ b; // Bitwise XOR

        System.out.println("The result of 5 ^ 3 is: " + result);
        // The result of 5 ^ 3 is: 6
    }
}
