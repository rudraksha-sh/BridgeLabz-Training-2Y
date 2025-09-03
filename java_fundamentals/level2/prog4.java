/*Write a program to find the distance in yards and miles for the distance provided by the user in feet
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => The distance in yards is ___ while the distance in miles is ___ */
public class prog4 {
    
    public static void main(String[] args) {
        double distanceInFeet = 5280.0; // Example distance in feet
        
        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;
        
        // Convert feet to miles (1 mile = 1760 yards, so 1 mile = 1760 * 3 feet)
        double distanceInMiles = distanceInFeet / (1760 * 3);
        
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f%n", distanceInYards, distanceInMiles);
    }
}
