/*Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators */
package control_flow.level3;

public class prog2 {
    
    public static void main(String[] args) {
        int year = 2000; // Example input
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("The year " + year + " is a Leap Year");
        } else {
            System.out.println("The year " + year + " is not a Leap Year");
        }
    }
}
