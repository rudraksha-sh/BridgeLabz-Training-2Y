/*Create a program to find the bonuses of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
 */
package control_flow.level2;

public class prog2 {
    
    public static void main(String[] args) {
        double salary = 60000; // Example input
        int yearsOfService = 6; // Example input
        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }
        System.out.println("The bonus amount is: " + bonus);
    }
}
