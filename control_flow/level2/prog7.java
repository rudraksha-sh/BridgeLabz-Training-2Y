/*Create a program to find the factors of a number taken as user input.
Hint => 
Get the input value for a variable named number and check if it is a positive integer.
Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i. */
package control_flow.level2;

public class prog7 {
    
    public static void main(String[] args) {
        int number = 28; // Example input
        if (number >= 1) {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
