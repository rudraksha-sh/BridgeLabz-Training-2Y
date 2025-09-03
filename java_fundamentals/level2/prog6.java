/*Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___ */
public class prog6 {
    
    public static void main(String[] args) {
        int number1 = 10; // Example first number
        int number2 = 3;  // Example second number
        
        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d%n", quotient, remainder, number1, number2);
    }
}
