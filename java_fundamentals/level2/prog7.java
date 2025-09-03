/*Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, and c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign the result to a variable
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___ */
public class prog7 {
    
    public static void main(String[] args) {
        int a = 5; // Example value for a
        int b = 10; // Example value for b
        int c = 3; // Example value for c
        
        // Perform the integer operations
        int operation1 = a + b * c; // a + (b * c)
        int operation2 = a * b + c; // (a * b) + c
        int operation3 = c + a / b; // c + (a / b)
        int operation4 = a % b + c; // (a % b) + c
        
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n", operation1, operation2, operation3, operation4);
    }
}
