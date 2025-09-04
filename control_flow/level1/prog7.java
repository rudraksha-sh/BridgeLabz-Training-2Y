/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => 
Spring Season is from March 20 to June 20
 */
package control_flow.level1;

public class prog7 {
    
    public static void main(String[] args) {
        int month = 4; // Example input for April
        int day = 15;  // Example input for 15th
        
        boolean isSpring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
        
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
