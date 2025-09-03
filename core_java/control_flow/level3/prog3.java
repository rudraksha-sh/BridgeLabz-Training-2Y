/*Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
Crade
A
B
c
D
E
R
Remarks
(Level 4, above agency-normalized standards)
(Level 3, at agency-normalized standards)
(Level 2, below, but approaching agency-normalized standards)
(Level 1, well below agency-normalized standards)
(Level 1- , too below agency-normalized standards)
(Remedial standards)
80% and above
70-79%
60-69%
50-59%
40-49%
39% and below
Hint => 
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
 */
package control_flow.level3;

public class prog3 {
    
    public static void main(String[] args) {
        int physics = 85;   // Example input for Physics
        int chemistry = 75; // Example input for Chemistry
        int maths = 65;     // Example input for Maths
        
        int totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 3.0);
        
        String grade;
        String remarks;
        
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
        
        System.out.println("Average Mark: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
