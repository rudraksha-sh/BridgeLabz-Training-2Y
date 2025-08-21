/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___ */
public class que10 {
    public static void main(String[] args) {
        double heightInCm = 170.0; // Example height in centimeters
        double inches = heightInCm / 2.54; // Convert cm to inches
        int feet = (int) (inches / 12); // Calculate feet
        inches = inches % 12; // Remaining inches after converting to feet
        
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
    }
    
}
