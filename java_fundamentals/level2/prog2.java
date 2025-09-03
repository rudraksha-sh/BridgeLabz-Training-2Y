/*Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
I/P => base, height
O/P => The Area of the triangle in sq in is ___ and sq cm is ___ */
public class prog2 {
    
    public static void main(String[] args) {
        double base = 5.0; // base in cm
        double height = 10.0; // height in cm
        
        // Calculate area in square centimeters
        double areaCm2 = 0.5 * base * height;
        
        // Convert area to square inches (1 inch = 2.54 cm, so 1 sq inch = 2.54^2 sq cm)
        double areaIn2 = areaCm2 / (2.54 * 2.54);
        
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaIn2, areaCm2);
    }
}
