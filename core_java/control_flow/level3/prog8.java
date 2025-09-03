/*Create a program to check if a number taken from the user is a Harshad Number.
Hint => 
A Harshad number is an integer which is divisible by the sum of its digits. 
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Create a while loop to access each digit of the number.
Inside the loop, add each digit of the number to sum.
Check if the number is perfectly divisible by the sum.
If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
 */
package control_flow.level3;

public class prog8 {
    
    public static void main(String[] args) {
        int number = 18; // Example input
        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of digits
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit;            // Add it to sum
            number /= 10;           // Remove the last digit
        }

        // Check if original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
    }
}
