/*The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
Hint => 
1. Create a variable named fee and assign 125000 to it.
2. Create another variable discountPercent and assign 10 to it.
3. Compute discount and assign it to the discount variable.
4. Compute and print the fee you have to pay by subtracting the discount from the fee.
O/P => The discount amount is INR ___ and final discounted fee is INR ___
 */
public class que6 {
    
    public static void main(String[] args) {
        double fee = 125000.0;
        double discountPercent = 10.0;
        
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
