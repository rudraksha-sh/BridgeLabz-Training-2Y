/*Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a variable counter and assign counter = number - 1; Use the while loop till the counter is equal to 1.
Inside the loop, check if the number is perfectly divisible by the counter then assign the counter to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
 */
package control_flow.level2;

public class prog10 {
    
    public static void main(String[] args) {
        int number = 28; // Example input
        int greatestFactor = 1;
        if (number >= 1) {
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
