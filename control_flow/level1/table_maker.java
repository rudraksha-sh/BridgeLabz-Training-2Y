package control_flow.level1;

public class table_maker {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = input.nextInt();
        for(int i = 1; i <= 10; i++) {  
            System.out.println(number + " x " + i + " = " + (number * i));  
        }
        input.close();
}
}