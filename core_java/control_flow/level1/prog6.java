/*Write a program to check whether a number is positive, negative, or zero.
Hint => 
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero. 
 */
package control_flow.level1;

public class prog6 {
    
    public static void main(String[] args) {
        int number = -5; // Example input
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
