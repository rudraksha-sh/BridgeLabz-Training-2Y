/*Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break; */
package control_flow.level1;

public class prog11 {
    
    public static void main(String[] args) {
        double total = 0.0;
        double userInput = 5.0; // Example input, replace with actual user input logic

        while (true) {
            if (userInput <= 0) {
                break;
            }
            total += userInput;
            // Here you would typically get new user input, for example:
            // userInput = scanner.nextDouble();
            userInput = 0; // For demonstration, we set it to 0 to exit the loop
        }

        System.out.println("The total sum is: " + total);
    }
}
