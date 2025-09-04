/*Rewrite the program to find all the multiples of a number below 100 using while loop.
Hint => 
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Create a counter variable and assign counter = number - 1; Use a while till the counter is > 1
Inside the loop, check if the counter perfectly divides the number. If true, print the number and continue the loop. */
package control_flow.level2;

public class prog13 {
    
    public static void main(String[] args) {
        int number = 15; // Example input
        if (number >= 1 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            int i = 100;
            while (i >= 1) {
                if (i % number == 0) {
                    System.out.println(i);
                }
                i--;
            }
        } else {
            System.out.println("The number " + number + " is not a positive integer below 100");
        }
    }
}
