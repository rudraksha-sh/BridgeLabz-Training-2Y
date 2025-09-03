/*Create a program to find the BMI of a person
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
<=18.4 : Underweight
18.5 - 24.9 : normal
25.0 - 39.9 : Overweight
>=40.0 : Obese

 */
package control_flow.level3;

public class prog7 {
    
    public static void main(String[] args) {
        double weight = 70.0; // Example weight in kg
        double heightCm = 175.0; // Example height in cm
        double heightM = heightCm / 100; // Convert height to meters

        double bmi = weight / (heightM * heightM);
        System.out.printf("The BMI is: %.2f%n", bmi);

        if (bmi <= 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Weight Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}
