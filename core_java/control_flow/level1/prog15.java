/*Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 
 */
package control_flow.level1;

public class prog15 {
    
    public static void main(String[] args) {
        int number = 5; // Example input
        if (number >= 1) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
