/*Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___
 */
public class prog4 {

    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (double) profit / costPrice * 100;

        System.out.printf("The Cost Price is INR %d and Selling Price is INR %d%nThe Profit is INR %d and the Profit Percentage is %.2f%%%n", 
                          costPrice, sellingPrice, profit, profitPercentage);
    }
}
