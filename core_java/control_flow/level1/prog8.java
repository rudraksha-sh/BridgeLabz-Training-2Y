/*Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
Hint => 
Create a variable counter to take user inputted value for the countdown.
Use the while loop to check if the counter is 1
Inside a while loop, print the value of the counter and decrement the counter. */
package control_flow.level1;

public class prog8 {
    
    public static void main(String[] args) {
        int counter = 10; // Example input for countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Rocket Launched!");
    }
}
