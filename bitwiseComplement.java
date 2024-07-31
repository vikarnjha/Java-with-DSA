public class bitwiseComplement {
    public static void main(String[] args) {
        // The bitwise complement operator ~ inverts each bit of its operand, effectively turning all 0s into 1s and all 1s into 0s. This operation is also known as a bitwise NOT operation.

        // To understand the result of ~5, we need to look at the binary representation of 5 and how it changes with the complement operator. In Java, integers are represented using 32 bits (for an int type).

        // The binary representation of 5 is:

       // 00000000 00000000 00000000 00000101
        // Applying the bitwise complement operator ~ to this value inverts all the bits:
       // 11111111 11111111 11111111 11111010
    //    This result is the binary representation of -6 in two's complement form. Thus, ~5 results in -6.

    int a = 5;
    int result = ~a; // Bitwise complement

    System.out.println("The result of ~5 is: " + result);
    // The result of ~5 is: -6
    }
}
