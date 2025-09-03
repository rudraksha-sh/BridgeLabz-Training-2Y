/*Rewrite program 8 to do the countdown using the for-loop */
package control_flow.level1;

public class prog9 {
    
    public static void main(String[] args) {
        int counter = 10; // Example input for countdown
        for (; counter >= 1; counter--) {
            System.out.println(counter);
        }
        System.out.println("Rocket Launched!");
    }
}
