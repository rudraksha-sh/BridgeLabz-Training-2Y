/*Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
 */
package control_flow.level1;

public class prog1 {
    
    public static void main(String[] args) {
        int number = 10; // Example input
        boolean isDivisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}
