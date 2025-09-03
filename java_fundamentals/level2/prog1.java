/*Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication, and division assign the result to a variable, and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication, and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___ */
import java.util.Scanner;
public class prog1 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        float number1 = scanner.nextFloat();
        
        System.out.print("Enter second number: ");
        float number2 = scanner.nextFloat();
        
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;
        
        System.out.printf("The addition, subtraction, multiplication, and division value of %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n", 
                          number1, number2, addition, subtraction, multiplication, division);
        
        scanner.close();
    }
}