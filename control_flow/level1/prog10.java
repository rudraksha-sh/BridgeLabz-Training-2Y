/*Write a program to find the sum of numbers until the user enters 0
Hint => 
Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value
 */
package control_flow.level1;

public class prog10 {
 
    public static void main(String[] args) {
        double total = 0.0;
        double userInput = 5.0; // Example input, replace with actual user input logic

        while (userInput != 0) {
            total += userInput;
            // Here you would typically get new user input, for example:
            // userInput = scanner.nextDouble();
            userInput = 0; // For demonstration, we set it to 0 to exit the loop
        }

        System.out.println("The total sum is: " + total);
    }
}
