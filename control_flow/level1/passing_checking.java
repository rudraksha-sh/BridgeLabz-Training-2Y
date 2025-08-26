/*check weather tha student is pass or fail :
 * if it is 40% and above then pass otherwise fail
 * I/P => marks of 1 subjects
 * O/P => Is the student pass or fail? ___
 */
package control_flow.level1;

public class passing_checking {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter marks of the student: ");
        int marks = input.nextInt();
        
        if(marks >= 40) {
            System.out.println("Is the student pass or fail? Pass");
        } else {
            System.out.println("Is the student pass or fail? fail");
        }
        
        input.close();
    }
    
}
