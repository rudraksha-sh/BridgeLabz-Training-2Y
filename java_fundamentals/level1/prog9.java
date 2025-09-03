/*Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___ */
import java.util.Scanner;
public class prog9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Student Fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double discountedPrice = fee - discount;

        System.out.printf("The Discount Amount is INR %.2f and the Final Discounted Fee is INR %.2f%n", 
                          discount, discountedPrice);
        
        input.close();
    }
}