/*Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
 */
package control_flow.level1;

public class prog13 {
    
    public static void main(String[] args) {
        int number = 5; // Example input
        if (number >= 1) {
            int sum = number * (number + 1) / 2;
            int total = 0;
            for (int i = 1; i <= number; i++) {
                total += i;
            }
            System.out.println("The sum of " + number + " natural numbers using formula is " + sum);
            System.out.println("The sum of " + number + " natural numbers using for loop is " + total);
            if (sum == total) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a discrepancy in the computations.");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
