/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
 */
package control_flow.level2;

public class prog6 {
    
    public static void main(String[] args) {
        int ageAmar = 25; // Example input
        int ageAkbar = 30; // Example input
        int ageAnthony = 22; // Example input

        double heightAmar = 5.8; // Example input
        double heightAkbar = 6.0; // Example input
        double heightAnthony = 5.9; // Example input

        // Finding the youngest friend
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("The youngest friend is Amar with age: " + ageAmar);
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("The youngest friend is Akbar with age: " + ageAkbar);
        } else {
            System.out.println("The youngest friend is Anthony with age: " + ageAnthony);
        }

        // Finding the tallest friend
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("The tallest friend is Amar with height: " + heightAmar);
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("The tallest friend is Akbar with height: " + heightAkbar);
        } else {
            System.out.println("The tallest friend is Anthony with height: " + heightAnthony);
        }
    }
}
