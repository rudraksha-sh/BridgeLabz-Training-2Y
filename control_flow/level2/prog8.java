/*Rewrite the above program 7 to find the factors of a number using the while loop
Hint => 
Get the input value for a variable named number and check if it is a positive integer.
Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.
 */
package control_flow.level2;

public class prog8 {
    
    public static void main(String[] args) {
        int number = 28; // Example input
        if (number >= 1) {
            System.out.println("Factors of " + number + " are:");
            int i = 1;
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
