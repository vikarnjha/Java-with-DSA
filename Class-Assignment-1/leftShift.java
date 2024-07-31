public class leftShift {
    public static void main(String[] args) {
        // The left shift operator << shifts the bits of the first operand to the left by the number of positions specified by the second operand. Each shift to the left multiplies the number by 2.

        // The result of 5 << 1 can be calculated as follows:
        
        // 5: 0000 0000 0000 0000 0000 0000 0000 0101 (binary representation)
        // << 1: 0000 0000 0000 0000 0000 0000 0000 1010 (after shifting left by 1 position)
        // So, 5 << 1 results in 10.

        int a = 5;
        int result = a << 1; // Left shift

        System.out.println("The result of 5 << 1 is: " + result);
        // The result of 5 << 1 is: 10
    }
}
