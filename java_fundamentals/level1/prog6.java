/*The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
Hint => 
Create a variable named fee and assign 125000 to it.
Create another variable discountPercent and assign 10 to it.
Compute discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
 */
public class prog6 {

    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;

        double discount = (double) discountPercent / 100 * fee;
        double discountedPrice = fee - discount;

        System.out.printf("The Discounted Amount is INR %.2f and the Discounted Price to be paid is INR %.2f%n", 
                          discount, discountedPrice);
    }
}