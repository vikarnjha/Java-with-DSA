public class rightShift {
    public static void main(String[] args) {
        // The right shift operator >> shifts the bits of the first operand to the right by the number of positions specified by the second operand. Each shift to the right divides the number by 2 and discards any bits that fall off.

        // The result of 5 >> 1 can be calculated as follows:
        
       
        // 5: 0000 0000 0000 0000 0000 0000 0000 0101 (binary representation)
        // >> 1: 0000 0000 0000 0000 0000 0000 0000 0010 (after shifting right by 1 position)
        // So, 5 >> 1 results in 2. 

        int a = 5;
        int result = a >> 1; // Right shift

        System.out.println("The result of 5 >> 1 is: " + result);
        // The result of 5 >> 1 is: 2
    }
}
