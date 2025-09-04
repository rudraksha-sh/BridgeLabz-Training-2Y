/*Create a program to find all the multiples of a number taken as user input below 100.
Hint => 
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Run a for loop backward: from i = 100 to i = 1.
Inside the loop, check if i perfectly divide the number. If true, print the number and continue the loop. */
package control_flow.level2;

public class prog11 {
    
    public static void main(String[] args) {
        int number = 15; // Example input
        if (number >= 1 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer below 100");
        }
    }
}
