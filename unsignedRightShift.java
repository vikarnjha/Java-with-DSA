public class unsignedRightShift {
    public static void main(String[] args) {
        // The unsigned right shift operator >>> shifts the bits of the operand to the right by the specified number of positions, filling the leftmost bits with zeros. This operator is particularly useful for working with binary data and for logical bit shifting, as it does not preserve the sign bit.

        // The result of 5 >>> 1 can be calculated as follows:


        // 5: 0000 0000 0000 0000 0000 0000 0000 0101 (binary representation)
        // >>> 1: 0000 0000 0000 0000 0000 0000 0000 0010 (after shifting right by 1 position)
        // So, 5 >>> 1 results in 2.

        int a = 5;
        int result = a >>> 1; // Unsigned right shift

        System.out.println("The result of 5 >>> 1 is: " + result);
        // The result of 5 >>> 1 is: 2
    }
}
