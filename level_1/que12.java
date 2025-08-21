/*Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___ */
public class que12 {
    public static void main(String[] args) {
        double distanceInFeet = 5280.0; 
        double yards = distanceInFeet / 3; 
        double miles = yards / 1760; 
        
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
    
}
