/*Write a program to find the side of the square whose parameter you read from the user 
Hint => Perimeter of the Square is 4 times the side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____ */
public class prog3 {
    
    public static void main(String[] args) {
        double perimeter = 20.0; // Example perimeter in cm
        
        // Calculate the side length of the square
        double sideLength = perimeter / 4;
        
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", sideLength, perimeter);
    }
}
