/*Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
 */
package control_flow.level1;

public class prog2 {
    
    public static void main(String[] args) {
        int number1 = 5; // Example input
        int number2 = 10; // Example input
        int number3 = 15; // Example input
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
    }
}
