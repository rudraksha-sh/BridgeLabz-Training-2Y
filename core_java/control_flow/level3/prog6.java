/*Create a program to count the number of digits in an integer.
Hint => 
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits
 */
package control_flow.level3;

public class prog6 {
    
    public static void main(String[] args) {
        int number = 12345; // Example input
        int count = 0;

        if (number == 0) {
            count = 1; // Special case for 0
        } else {
            while (number != 0) {
                number /= 10; // Remove the last digit
                count++;
            }
        }

        System.out.println("The number of digits is: " + count);
    }
}
