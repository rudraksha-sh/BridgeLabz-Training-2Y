/*Rewrite the program 4 FizzBuzz using the while loop  */
package control_flow.level2;

public class prog5 {
    
    public static void main(String[] args) {
        int number = 15; // Example input
        if (number >= 1) {
            int i = 1;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
