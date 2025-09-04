/*Rewrite the above program to find the power of a number using a while loop.
Hint => 
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
Finally, print the result
 */
package control_flow.level2;

public class prog14 {
    
    public static void main(String[] args) {
        int number = 2; // Example base
        int power = 5; // Example exponent
        if (number >= 1 && power >= 0) {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Please enter a positive integer for base and a non-negative integer for exponent.");
        }
    }
}
