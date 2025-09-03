/*Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___ */
public class prog5 {
    
    public static void main(String[] args) {
        double unitPrice = 50.0; // Example unit price in INR
        int quantity = 3; // Example quantity
        
        // Calculate total price
        double totalPrice = unitPrice * quantity;
        
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n", totalPrice, quantity, unitPrice);
    }
}
