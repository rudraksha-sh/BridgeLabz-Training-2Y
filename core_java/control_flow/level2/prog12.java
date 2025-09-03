/*Create a program to find the power of a number.
Hint => 
Get integer input for two variables - number and power and check for positive integer
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result
 */
package control_flow.level2;

public class prog12 {
    
    public static void main(String[] args) {
        int number = 2; // Example base
        int power = 5; // Example exponent
        if (number >= 1 && power >= 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Please enter a positive integer for base and a non-negative integer for exponent.");
        }
    }
}
