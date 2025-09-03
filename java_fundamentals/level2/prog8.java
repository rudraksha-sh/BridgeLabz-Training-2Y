/*Similarly, write the DoubleOpt program by taking double values and doing the same operations.
 */
public class prog8 {
    
    public static void main(String[] args) {
        double a = 5.0; // Example value for a
        double b = 10.0; // Example value for b
        double c = 3.0; // Example value for c
        
        // Perform the double operations
        double operation1 = a + b * c; // a + (b * c)
        double operation2 = a * b + c; // (a * b) + c
        double operation3 = c + a / b; // c + (a / b)
        double operation4 = a % b + c; // (a % b) + c
        
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n", operation1, operation2, operation3, operation4);
    }
}
